package com.muskala.motoadvscrapper.service;

import com.muskala.motoadvscrapper.data.allegro.AllegroRs;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Collections;

/**
 * @author Marcin Muskala
 * @since 28.12.2017
 */
@Service
public class AllegroScrapperService {
    private static final String ALLEGRO_MAIN_URL = "https://allegro.pl/kategoria/samochody-osobowe-4029";

    public AllegroRs getAllegroRs() {
        RestTemplate restTemplate = new RestTemplate();
        HttpHeaders headers = new HttpHeaders();
        headers.setAccept(Collections.singletonList(MediaType.APPLICATION_JSON));

        HttpEntity<String> entity = new HttpEntity<>("parameters", headers);

        return restTemplate.postForObject(ALLEGRO_MAIN_URL, entity, AllegroRs.class);
    }
}
