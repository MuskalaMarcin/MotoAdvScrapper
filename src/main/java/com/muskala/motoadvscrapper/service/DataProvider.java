package com.muskala.motoadvscrapper.service;

import com.muskala.motoadvscrapper.data.CarData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Marcin Muskala
 * @since 28.12.2017
 */
@Service
public class DataProvider {
    @Autowired
    List<IScrapperService> scrapperServices;

    public List<CarData> getCarData() {
        return scrapperServices.stream().map(IScrapperService::getCarData).flatMap(List::stream)
                .collect(Collectors.toList());
    }
}
