package com.example.trzyEndpointyRestowe.status.web;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@SpringBootTest
class StatusControllerTest {

    @Autowired
    private StatusController statusController;

    @Test
    public void pingReturnPong() {
        assertThat(statusController).isNotNull();
    }
}