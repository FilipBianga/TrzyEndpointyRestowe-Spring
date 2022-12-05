package com.example.zadanierekrutacyjnespring.numbers.web;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;


@SpringBootTest
class NumbersControllerTest {

    @Autowired
    private NumbersController numbersController;

    @Test
    public void numberNotNull() {
        assertThat(numbersController).isNotNull();
    }

}