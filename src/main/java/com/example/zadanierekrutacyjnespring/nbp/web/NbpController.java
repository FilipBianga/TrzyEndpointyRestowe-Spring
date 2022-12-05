package com.example.zadanierekrutacyjnespring.nbp.web;

import com.example.zadanierekrutacyjnespring.nbp.application.NbpService;
import com.example.zadanierekrutacyjnespring.nbp.domain.Currency;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Endpoint 3
 * Celem zadania jest wysłanie żądania, które umożliwi pobranie z NBP (zewnętrzne API)
 * aktualny kurs danej waluty
 */

@RequestMapping("/currencies")
@RestController
public class NbpController {

    @Autowired
    private NbpService nbpService;

    /**
     * @return wszystkich "rates" z uwzględnieniem "code, mid"
     */

    @GetMapping("/all")
    private Currency[] getValue() {
        return nbpService.findAll();

    }

}
