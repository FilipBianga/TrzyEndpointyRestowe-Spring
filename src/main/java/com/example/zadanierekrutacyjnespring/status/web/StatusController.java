package com.example.zadanierekrutacyjnespring.status.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Endpoint 1
 * Pobranie konkretnej odpowiedzi na ścieżce /status/ping
 */

@RequestMapping("/status")
@RestController
public class StatusController {

    /**
     * @return "pong"
     */

    @GetMapping("/ping")
    public String pingPong() {
        return "pong";
    }
}
