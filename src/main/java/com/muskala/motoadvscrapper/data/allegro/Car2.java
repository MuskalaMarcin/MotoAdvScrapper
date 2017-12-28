package com.muskala.motoadvscrapper.data.allegro;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.util.List;

/**
 * @author Marcin Muskala
 * @since 28.12.2017
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({"id", "name", "url", "vendor", "location", "seller", "promotion", "shipping", "images",
        "sellingMode", "quantity", "categoryPath", "publication", "parameters", "coins"})
public class Car2 {

    @JsonProperty("id")
    public String id;
    @JsonProperty("name")
    public String name;
    @JsonProperty("url")
    public String url;
    @JsonProperty("vendor")
    public String vendor;
    @JsonProperty("location")
    public Location location;
    @JsonProperty("seller")
    public Seller seller;
    @JsonProperty("promotion")
    public Promotion promotion;
    @JsonProperty("shipping")
    public Shipping shipping;
    @JsonProperty("images")
    public List<Image> images = null;
    @JsonProperty("sellingMode")
    public SellingMode sellingMode;
    @JsonProperty("quantity")
    public Quantity quantity;
    @JsonProperty("categoryPath")
    public List<CategoryPath> categoryPath = null;
    @JsonProperty("publication")
    public Publication publication;
    @JsonProperty("parameters")
    public List<Parameter> parameters = null;
    @JsonProperty("coins")
    public Coins coins;

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

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({"price"})
class Advertisement {

    @JsonProperty("price")
    public Price price;

    public Price getPrice() {
        return price;
    }

    public void setPrice(Price price) {
        this.price = price;
    }
}

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({"id"})
class CategoryPath {

    @JsonProperty("id")
    public String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({"total"})
class Coins {

    @JsonProperty("total")
    public Total total;

    public Total getTotal() {
        return total;
    }

    public void setTotal(Total total) {
        this.total = total;
    }
}

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({"url"})
class Image {

    @JsonProperty("url")
    public String url;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({"country", "city"})
class Location {

    @JsonProperty("country")
    public String country;
    @JsonProperty("city")
    public String city;

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({"name", "values", "highlight"})
class Parameter {

    @JsonProperty("name")
    public String name;
    @JsonProperty("values")
    public List<String> values = null;
    @JsonProperty("highlight")
    public String highlight;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getValues() {
        return values;
    }

    public void setValues(List<String> values) {
        this.values = values;
    }

    public String getHighlight() {
        return highlight;
    }

    public void setHighlight(String highlight) {
        this.highlight = highlight;
    }
}

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({"amount", "currency"})
class Price {

    @JsonProperty("amount")
    public String amount;
    @JsonProperty("currency")
    public String currency;

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }
}

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({"emphasized", "bold", "highlight"})
class Promotion {

    @JsonProperty("emphasized")
    public String emphasized;
    @JsonProperty("bold")
    public String bold;
    @JsonProperty("highlight")
    public String highlight;

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

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({"endingTime"})
class Publication {

    @JsonProperty("endingTime")
    public String endingTime;

    public String getEndingTime() {
        return endingTime;
    }

    public void setEndingTime(String endingTime) {
        this.endingTime = endingTime;
    }
}

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({"unitType", "value"})
class Quantity {

    @JsonProperty("unitType")
    public String unitType;
    @JsonProperty("value")
    public Integer value;

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

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({"id", "superSeller"})
class Seller {

    @JsonProperty("id")
    public String id;
    @JsonProperty("superSeller")
    public String superSeller;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSuperSeller() {
        return superSeller;
    }

    public void setSuperSeller(String superSeller) {
        this.superSeller = superSeller;
    }
}

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({"advertisement"})
class SellingMode {

    @JsonProperty("advertisement")
    public Advertisement advertisement;

    public Advertisement getAdvertisement() {
        return advertisement;
    }

    public void setAdvertisement(Advertisement advertisement) {
        this.advertisement = advertisement;
    }
}

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({"freeDelivery", "freeDeliveryWeek", "freeReturn"})
class Shipping {

    @JsonProperty("freeDelivery")
    public String freeDelivery;
    @JsonProperty("freeDeliveryWeek")
    public String freeDeliveryWeek;
    @JsonProperty("freeReturn")
    public String freeReturn;

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

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({"quantity"})
class Total {

    @JsonProperty("quantity")
    public Integer quantity;

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }
}