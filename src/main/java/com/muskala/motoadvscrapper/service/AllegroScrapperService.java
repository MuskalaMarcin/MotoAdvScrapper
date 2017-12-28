package com.muskala.motoadvscrapper.service;

import com.muskala.motoadvscrapper.data.CarData;
import com.muskala.motoadvscrapper.data.allegro.AllegroRs;
import com.muskala.motoadvscrapper.data.allegro.Car;
import com.muskala.motoadvscrapper.data.allegro.Image;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.time.LocalDate;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 * @author Marcin Muskala
 * @since 28.12.2017
 */
@Service
public class AllegroScrapperService implements IScrapperService {
    private static final String ALLEGRO_MAIN_URL = "https://allegro.pl/kategoria/samochody-osobowe-4029";

    @Override
    public List<CarData> getCarData() {
        return getAllegroRs().getCarsList().stream().map(this::mapToCarData).collect(Collectors.toList());
    }

    private CarData mapToCarData(Car car) {
        String name = car.getName();
        String url = car.getUrl();
        String vendor = car.getVendor();
        String location = car.getLocation().getCity();
        Double price = getPrice(car);
        List<String> images = car.getImages().stream().map(Image::getUrl).collect(Collectors.toList());
        Integer mileage = null;
        Integer year = null;
        LocalDate dateAdded = null;

        return new CarData(name, url, vendor, location, price, images, mileage, year, dateAdded);
    }

    private Double getPrice(Car car) {
        String priceString =
                Optional.ofNullable(car.getSellingMode().getAdvertisement()).orElse(car.getSellingMode().getBuyNow())
                        .getPrice().getAmount();
        return Double.parseDouble(priceString);
    }

    private AllegroRs getAllegroRs() {
        RestTemplate restTemplate = new RestTemplate();
        HttpHeaders headers = new HttpHeaders();
        headers.setAccept(Collections.singletonList(MediaType.APPLICATION_JSON));

        HttpEntity<String> entity = new HttpEntity<>("parameters", headers);
        return restTemplate.postForObject(ALLEGRO_MAIN_URL, entity, AllegroRs.class);
    }
}
