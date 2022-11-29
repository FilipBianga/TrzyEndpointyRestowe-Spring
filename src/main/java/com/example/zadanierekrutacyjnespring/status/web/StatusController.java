package com.example.zadanierekrutacyjnespring.status.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/status")
@RestController
public class StatusController {

    @GetMapping("/ping")
    public String pingPong() {
        return "pong";
    }
}
