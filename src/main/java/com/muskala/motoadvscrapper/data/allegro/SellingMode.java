package com.muskala.motoadvscrapper.data.allegro;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * @author Marcin Muskala
 * @since 28.12.2017
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({"advertisement", "buyNow"})
public class SellingMode {

    @JsonProperty("advertisement")
    private Advertisement advertisement;

    @JsonProperty("buyNow")
    private Advertisement buyNow;

    public Advertisement getAdvertisement() {
        return advertisement;
    }

    public void setAdvertisement(Advertisement advertisement) {
        this.advertisement = advertisement;
    }

    public Advertisement getBuyNow() {
        return buyNow;
    }

    public void setBuyNow(Advertisement buyNow) {
        this.buyNow = buyNow;
    }
}
