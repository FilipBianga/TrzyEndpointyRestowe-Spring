package com.example.trzyEndpointyRestowe.nbp.web;

import com.example.trzyEndpointyRestowe.nbp.application.NbpService;
import com.example.trzyEndpointyRestowe.nbp.domain.Currency;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Endpoint 3
 * Celem zadania jest wysłanie żądania, które umożliwi pobranie z NBP (zewnętrzne API)
 * aktualny kurs danej waluty
 */

@RequestMapping("/currency")
@RestController
public class NbpController {

    @Autowired
    private NbpService nbpService;

    /**
     * @return wszystkich "rates" z uwzględnieniem "code, mid"
     */

    @GetMapping("/specific")
    private List<Currency> getValue(@RequestParam String code) {
        return nbpService.findSpecificCurrencyByItsCode(code);

    }

}
