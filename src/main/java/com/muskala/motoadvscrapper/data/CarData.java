package com.muskala.motoadvscrapper.data;

import java.time.LocalDate;
import java.util.List;

/**
 * @author Marcin Muskala
 * @since 28.12.2017
 */
public class CarData {
    private String name;
    private String url;
    private String vendor;
    private String location;
    private Double price;
    private List<String> images;
    private Integer mileage;
    private Integer year;
    private LocalDate dateAdded;

    public CarData(String name, String url, String vendor, String location, Double price, List<String> images,
                   Integer mileage, Integer year, LocalDate dateAdded) {
        this.name = name;
        this.url = url;
        this.vendor = vendor == null ? getVendor(url) : vendor;
        this.location = location;
        this.price = price;
        this.images = images;
        this.mileage = mileage;
        this.year = year;
        this.dateAdded = dateAdded;
    }

    private String getVendor(String url) {
        if (url.contains("allegro.pl")) {
            return "allegro";
        } else if (url.contains("otomoto.pl")) {
            return "otomoto";
        } else {
            return "olx";
        }
    }

    public String getName() {
        return name;
    }

    public String getUrl() {
        return url;
    }

    public String getVendor() {
        return vendor;
    }

    public String getLocation() {
        return location;
    }

    public Double getPrice() {
        return price;
    }

    public List<String> getImages() {
        return images;
    }

    public Integer getMileage() {
        return mileage;
    }

    public Integer getYear() {
        return year;
    }

    public LocalDate getDateAdded() {
        return dateAdded;
    }
}
