package com.muskala.motoadvscrapper.data.allegro;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * @author Marcin Muskala
 * @since 28.12.2017
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({"freeDelivery", "freeDeliveryWeek", "freeReturn"})
public class Shipping {

    @JsonProperty("freeDelivery")
    private String freeDelivery;
    @JsonProperty("freeDeliveryWeek")
    private String freeDeliveryWeek;
    @JsonProperty("freeReturn")
    private String freeReturn;

    public String getFreeDelivery() {
        return freeDelivery;
    }

    public void setFreeDelivery(String freeDelivery) {
        this.freeDelivery = freeDelivery;
    }

    public String getFreeDeliveryWeek() {
        return freeDeliveryWeek;
    }

    public void setFreeDeliveryWeek(String freeDeliveryWeek) {
        this.freeDeliveryWeek = freeDeliveryWeek;
    }

    public String getFreeReturn() {
        return freeReturn;
    }

    public void setFreeReturn(String freeReturn) {
        this.freeReturn = freeReturn;
    }
}
