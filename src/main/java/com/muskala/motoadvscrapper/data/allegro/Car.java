package com.muskala.motoadvscrapper.data.allegro;

/**
 * @author Marcin Muskala
 * @since 28.12.2017
 */
public class Car {
    private String name;
    private String url;
    private String vendor;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getVendor() {
        return vendor;
    }

    public void setVendor(String vendor) {
        this.vendor = vendor;
    }
}
