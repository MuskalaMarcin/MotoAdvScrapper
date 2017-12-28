package com.muskala.motoadvscrapper.data.allegro;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * @author Marcin Muskala
 * @since 28.12.2017
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({"unitType", "value"})
public class Quantity {

    @JsonProperty("unitType")
    private String unitType;
    @JsonProperty("value")
    private Integer value;

    public String getUnitType() {
        return unitType;
    }

    public void setUnitType(String unitType) {
        this.unitType = unitType;
    }

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }
}
