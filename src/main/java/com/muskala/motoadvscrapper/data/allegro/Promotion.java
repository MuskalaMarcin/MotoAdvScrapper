package com.muskala.motoadvscrapper.data.allegro;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * @author Marcin Muskala
 * @since 28.12.2017
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({"emphasized", "bold", "highlight"})
public class Promotion {

    @JsonProperty("emphasized")
    private String emphasized;
    @JsonProperty("bold")
    private String bold;
    @JsonProperty("highlight")
    private String highlight;

    public String getEmphasized() {
        return emphasized;
    }

    public void setEmphasized(String emphasized) {
        this.emphasized = emphasized;
    }

    public String getBold() {
        return bold;
    }

    public void setBold(String bold) {
        this.bold = bold;
    }

    public String getHighlight() {
        return highlight;
    }

    public void setHighlight(String highlight) {
        this.highlight = highlight;
    }
}
