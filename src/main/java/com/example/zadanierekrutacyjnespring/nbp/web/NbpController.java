package com.example.zadanierekrutacyjnespring.nbp.web;

import com.example.zadanierekrutacyjnespring.nbp.application.NbpService;
import com.example.zadanierekrutacyjnespring.nbp.domain.Code;
import com.example.zadanierekrutacyjnespring.nbp.domain.Currency;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RequestMapping("/currencies")
@RestController
public class NbpController {

    @Autowired
    private NbpService nbpService;

    @GetMapping("/all")
    private Currency[] getValue() {
        return nbpService.findAll();

    }

    @PostMapping("/post")
    private Code[] post(@RequestBody Code code) {
        return nbpService.findCode();

    }
}
