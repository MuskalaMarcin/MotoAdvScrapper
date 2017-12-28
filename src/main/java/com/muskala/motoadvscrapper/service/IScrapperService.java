package com.muskala.motoadvscrapper.service;

import com.muskala.motoadvscrapper.data.CarData;

import java.util.List;

/**
 * @author Marcin Muskala
 * @since 28.12.2017
 */
public interface IScrapperService {
    List<CarData> getCarData();
}
