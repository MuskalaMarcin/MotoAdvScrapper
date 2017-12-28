package com.muskala.motoadvscrapper.data.allegro;

import java.util.List;

/**
 * @author Marcin Muskala
 * @since 28.12.2017
 */
public class Items {
    private List<Car2> sponsored;
    private List<Car2> promoted;
    private List<Car2> regular;

    public List<Car2> getSponsored() {
        return sponsored;
    }

    public void setSponsored(List<Car2> sponsored) {
        this.sponsored = sponsored;
    }

    public List<Car2> getPromoted() {
        return promoted;
    }

    public void setPromoted(List<Car2> promoted) {
        this.promoted = promoted;
    }

    public List<Car2> getRegular() {
        return regular;
    }

    public void setRegular(List<Car2> regular) {
        this.regular = regular;
    }
}