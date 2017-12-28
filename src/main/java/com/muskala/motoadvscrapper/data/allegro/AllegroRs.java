package com.muskala.motoadvscrapper.data.allegro;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Marcin Muskala
 * @since 28.12.2017
 */
public class AllegroRs {
    @JsonProperty("pagination bottom")
    private PaginationBottom paginationBottom;

    public PaginationBottom getPaginationBottom() {
        return paginationBottom;
    }

    public void setPaginationBottom(PaginationBottom paginationBottom) {
        this.paginationBottom = paginationBottom;
    }

    public List<Car> getCarsList() {
        List<Car> carsList = new ArrayList<>(this.getPaginationBottom().getCollection().getItems().getPromoted());
        carsList.addAll(this.getPaginationBottom().getCollection().getItems().getRegular());
        carsList.addAll(this.getPaginationBottom().getCollection().getItems().getSponsored());
        return carsList;
    }
}

class PaginationBottom {
    private Collection collection;

    public Collection getCollection() {
        return collection;
    }

    public void setCollection(Collection collection) {
        this.collection = collection;
    }
}

class Items {
    private List<Car> sponsored;
    private List<Car> promoted;
    private List<Car> regular;

    public List<Car> getSponsored() {
        return sponsored;
    }

    public void setSponsored(List<Car> sponsored) {
        this.sponsored = sponsored;
    }

    public List<Car> getPromoted() {
        return promoted;
    }

    public void setPromoted(List<Car> promoted) {
        this.promoted = promoted;
    }

    public List<Car> getRegular() {
        return regular;
    }

    public void setRegular(List<Car> regular) {
        this.regular = regular;
    }
}

class Collection {
    private Items items;

    public Items getItems() {
        return items;
    }

    public void setItems(Items items) {
        this.items = items;
    }
}
