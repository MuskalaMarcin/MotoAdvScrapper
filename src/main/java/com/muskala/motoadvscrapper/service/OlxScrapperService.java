package com.muskala.motoadvscrapper.service;

import com.muskala.motoadvscrapper.data.CarData;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

/**
 * @author Marcin Muskala
 * @since 28.12.2017
 */
@Service
public class OlxScrapperService implements IScrapperService {
    private static final String OLX_URL = "https://www.olx.pl/motoryzacja/samochody/?search";

    @Override
    public List<CarData> getCarData() {
        try {
            Document document = Jsoup.connect(OLX_URL).get();
            Elements carDetails = document.body().getElementsByClass("wrap");
            return carDetails.stream().map(this::mapToCarData).collect(Collectors.toList());
        } catch (IOException e) {
            e.printStackTrace();
            return new ArrayList<>();
        }
    }

    private CarData mapToCarData(Element el) {
        String name = getName(el);
        String url = getUrl(el);
        String location = getLocation(el);
        Double price = getPrice(el);
        List<String> images = getImages(el);
        LocalDate dateAdded = getDateAdded(el);

        return new CarData(name, url, null, location, price, images, null, null, dateAdded);
    }

    private LocalDate getDateAdded(Element el) {
        String dateString = (el.getElementsByTag("p").stream().filter(p -> p.classNames()
                .containsAll(Arrays.asList("marginbott5", "lheight16", "color-9", "x-normal"))).map(Element::text)
                .collect(Collectors.joining()) + LocalDate.now().getYear()).replaceAll(" ", "");
        if (dateString.contains("wczoraj")) {
            return LocalDate.now().minusDays(1);
        } else if (dateString.contains("dzisiaj")) {
            return LocalDate.now();
        } else {
            DateTimeFormatter formatter =
                    new DateTimeFormatterBuilder().parseCaseInsensitive().appendPattern("ddMMMyyyy")
                            .toFormatter(Locale.forLanguageTag("pl-Pl"));
            try {
                LocalDate date = LocalDate.parse(dateString, formatter);
                if (date.isAfter(LocalDate.now())) {
                    return date.minusYears(1);
                }
                return date;
            } catch (DateTimeParseException e) {
                e.printStackTrace();
                return null;
            }
        }
    }

    private List<String> getImages(Element el) {
        return el.getElementsByTag("img").stream().map(e -> e.attr("src")).collect(Collectors.toList());
    }

    private String getLocation(Element el) {
        String location = el.attr("data-features").replaceAll(".+\"city_name\":\"", "").replaceAll("\".+", "");
        if (location.isEmpty()) {
            location = el.getElementsByTag("p").stream()
                    .filter(p -> p.classNames().containsAll(Arrays.asList("marginbott5", "lheight16", "color-9")) &&
                            !p.classNames().contains("x-normal")).map(Element::text).collect(Collectors.joining());
        }
        return location;
    }

    private String getUrl(Element el) {
        Element linkElement = getLinkElement(el);
        if (linkElement == null) {
            return "";
        } else {
            return linkElement.attr("href");
        }
    }

    private String getName(Element el) {
        Element linkElement = getLinkElement(el);
        if (linkElement == null) {
            return "";
        } else {
            return linkElement.text();
        }
    }

    private Element getLinkElement(Element el) {
        List<Element> linkElements = el.getElementsByClass("detailsLink").stream()
                .filter(e -> e.classNames().containsAll(Arrays.asList("linkWithHash", "link", "marginright5")))
                .collect(Collectors.toList());
        return linkElements.size() == 1 ? linkElements.get(0) : null;
    }

    private Double getPrice(Element el) {
        return Double.parseDouble(el.getElementsByAttributeValue("class", "price").stream().map(Element::text)
                .collect(Collectors.joining()).replaceAll("zł.*", "").replaceAll(" ", ""));
    }
}
