package com.example.trzyEndpointyRestowe.nbp.application;

import com.example.trzyEndpointyRestowe.nbp.domain.Currency;

import java.util.List;

public interface NbpService {
    List<Currency> findSpecificCurrencyByItsCode(String code);
}
