package com.muskala.motoadvscrapper.data.allegro;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.util.List;

/**
 * Schema for single car entity passed in allegro response
 *
 * @author Marcin Muskala
 * @since 28.12.2017
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({"id", "name", "url", "vendor", "location", "seller", "promotion", "shipping", "images",
        "sellingMode", "quantity", "categoryPath", "publication", "parameters", "coins"})
public class Car {
    @JsonProperty("id")
    private String id;
    @JsonProperty("name")
    private String name;
    @JsonProperty("url")
    private String url;
    @JsonProperty("vendor")
    private String vendor;
    @JsonProperty("location")
    private Location location;
    @JsonProperty("seller")
    private Seller seller;
    @JsonProperty("promotion")
    private Promotion promotion;
    @JsonProperty("shipping")
    private Shipping shipping;
    @JsonProperty("images")
    private List<Image> images = null;
    @JsonProperty("sellingMode")
    private SellingMode sellingMode;
    @JsonProperty("quantity")
    private Quantity quantity;
    @JsonProperty("categoryPath")
    private List<CategoryPath> categoryPath = null;
    @JsonProperty("publication")
    private Publication publication;
    @JsonProperty("parameters")
    private List<Parameter> parameters = null;
    @JsonProperty("coins")
    private Coins coins;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

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

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public Seller getSeller() {
        return seller;
    }

    public void setSeller(Seller seller) {
        this.seller = seller;
    }

    public Promotion getPromotion() {
        return promotion;
    }

    public void setPromotion(Promotion promotion) {
        this.promotion = promotion;
    }

    public Shipping getShipping() {
        return shipping;
    }

    public void setShipping(Shipping shipping) {
        this.shipping = shipping;
    }

    public List<Image> getImages() {
        return images;
    }

    public void setImages(List<Image> images) {
        this.images = images;
    }

    public SellingMode getSellingMode() {
        return sellingMode;
    }

    public void setSellingMode(SellingMode sellingMode) {
        this.sellingMode = sellingMode;
    }

    public Quantity getQuantity() {
        return quantity;
    }

    public void setQuantity(Quantity quantity) {
        this.quantity = quantity;
    }

    public List<CategoryPath> getCategoryPath() {
        return categoryPath;
    }

    public void setCategoryPath(List<CategoryPath> categoryPath) {
        this.categoryPath = categoryPath;
    }

    public Publication getPublication() {
        return publication;
    }

    public void setPublication(Publication publication) {
        this.publication = publication;
    }

    public List<Parameter> getParameters() {
        return parameters;
    }

    public void setParameters(List<Parameter> parameters) {
        this.parameters = parameters;
    }

    public Coins getCoins() {
        return coins;
    }

    public void setCoins(Coins coins) {
        this.coins = coins;
    }
}

