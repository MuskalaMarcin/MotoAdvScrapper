package com.muskala.motoadvscrapper.controller;

import com.muskala.motoadvscrapper.data.CarData;
import com.muskala.motoadvscrapper.data.allegro.AllegroRs;
import com.muskala.motoadvscrapper.data.olx.OlxRs;
import com.muskala.motoadvscrapper.service.AllegroScrapperService;
import com.muskala.motoadvscrapper.service.DataProvider;
import com.muskala.motoadvscrapper.service.OlxScrapperService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author Marcin Muskala
 * @since 28.12.2017
 */
@RestController
public class MainController {
    @Autowired
    DataProvider dataProvider;

    @RequestMapping(method = RequestMethod.GET, value = "/")
    public List<CarData> main() {
        return dataProvider.getCarData();
    }
}
