package com.example.zadanierekrutacyjnespring.numbers.web;

import com.example.zadanierekrutacyjnespring.numbers.domain.Numbers;
import io.swagger.models.auth.In;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.*;



@RequestMapping("/numbers")
@RestController
public class NumbersController {

    @PostMapping(value = "/sort-command")
    public ResponseEntity<String> postNumber(@RequestBody Numbers numbers) {
        List<Integer> sortedDescNumbers = numbers.getNumbers().stream()
                .sorted(Comparator.reverseOrder()).toList();

        List<Integer> sortedAscNumbers = numbers.getNumbers().stream()
                .sorted().toList();

        String asc = "numbers: " + sortedAscNumbers;
        String desc = "numbers: " + sortedDescNumbers;

        if(numbers.getOrder().equals("ASC")) {
            return ResponseEntity.status(HttpStatus.OK).body(asc);
        }if(numbers.getOrder().equals("DESC")) {
            return ResponseEntity.status(HttpStatus.OK).body(desc);
        }
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("BAD REQUEST");

    }
}