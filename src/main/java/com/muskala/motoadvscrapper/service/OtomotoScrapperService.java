package com.muskala.motoadvscrapper.service;

import com.muskala.motoadvscrapper.data.CarData;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Marcin Muskala
 * @since 28.12.2017
 */
@Service
public class OtomotoScrapperService implements IScrapperService {
    @Override
    public List<CarData> getCarData() {
        return new ArrayList<>();
    }
}
