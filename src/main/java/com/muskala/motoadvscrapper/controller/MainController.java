package com.muskala.motoadvscrapper.controller;

import com.muskala.motoadvscrapper.data.allegro.AllegroRs;
import com.muskala.motoadvscrapper.service.AllegroScrapperService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Marcin Muskala
 * @since 28.12.2017
 */
@RestController
public class MainController {
    @Autowired
    AllegroScrapperService allegroScrapperService;

    @RequestMapping(method = RequestMethod.GET, value = "/")
    public String main() {
        AllegroRs rs =  allegroScrapperService.getAllegroRs();
        return rs.toString();
    }
}
