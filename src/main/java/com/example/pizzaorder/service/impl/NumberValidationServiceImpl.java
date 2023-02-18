package com.example.pizzaorder.service.impl;

import com.example.pizzaorder.dto.NumberValidationResponse;
import com.example.pizzaorder.service.NumberValidationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class NumberValidationServiceImpl implements NumberValidationService {

    public final String url;

    public final String token;
    public final RestTemplate restTemplate;

    @Autowired
    public NumberValidationServiceImpl(final @Value("${url.api.layer}") String url,
                                       final @Value("${token.api.layer}") String token,
                                       final RestTemplate restTemplate) {
        this.url = url;
        this.restTemplate = restTemplate;
        this.token = token;
    }

    @Override
    public boolean isNumberValid(final String number) {
        HttpHeaders headers = new HttpHeaders();
        headers.set("apikey", this.token);

        HttpEntity<Void> requestEntity = new HttpEntity<>(headers);

        ResponseEntity<NumberValidationResponse> response =
                restTemplate.exchange(url + number, HttpMethod.GET, requestEntity, NumberValidationResponse.class);

        if (response.getStatusCode().is2xxSuccessful()) {
            return response.getBody().getValid().booleanValue();
        }

        return false;
    }
}
