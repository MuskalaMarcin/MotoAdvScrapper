package com.muskala.motoadvscrapper.data.allegro;

import com.fasterxml.jackson.annotation.JsonProperty;

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
}
