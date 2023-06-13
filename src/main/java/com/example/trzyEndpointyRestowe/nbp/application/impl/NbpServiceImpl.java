package com.example.trzyEndpointyRestowe.nbp.application.impl;

import com.example.trzyEndpointyRestowe.nbp.application.NbpService;
import com.example.trzyEndpointyRestowe.nbp.domain.Currency;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Flux;

import java.util.List;


@Service
class NbpServiceImpl implements NbpService {
    private static final String APINBP = "https://api.nbp.pl/api/exchangerates/rates/a/";

    public List<Currency> findSpecificCurrencyByItsCode(String code) {
        Flux<Currency> midValueCodeFlux = WebClient
                .create(APINBP + code + "?format=json")
                .get()
                .retrieve()
                .bodyToFlux(Currency.class);

        List<Currency> midValueCodeList = midValueCodeFlux
                .collectList()
                .share().block();

        return midValueCodeList;
    }

}
