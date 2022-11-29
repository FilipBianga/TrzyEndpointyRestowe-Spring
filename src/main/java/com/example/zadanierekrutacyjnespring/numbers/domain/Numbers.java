package com.example.zadanierekrutacyjnespring.numbers.domain;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class Numbers {
    private List<Integer> numbers;
    private String order;
}
