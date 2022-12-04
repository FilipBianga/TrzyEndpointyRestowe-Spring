package com.example.zadanierekrutacyjnespring.nbp.application;

import com.example.zadanierekrutacyjnespring.nbp.domain.Code;
import com.example.zadanierekrutacyjnespring.nbp.domain.Currency;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;


@Service
public class NbpService {
    @Autowired
    RestTemplate restTemplate;

    public Currency[] findAll() {
        return restTemplate.getForObject("http://api.nbp.pl/api/exchangerates/tables/A?format=json", Currency[].class);
    }

    public Code[] findCode() {
        return restTemplate.postForObject("http://localhost:8080/currencies/all", Currency[].class, Code[].class);
    }

}
