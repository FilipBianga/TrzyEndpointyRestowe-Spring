package com.example.trzyEndpointyRestowe.numbers.web;

import com.example.trzyEndpointyRestowe.numbers.domain.Numbers;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.*;

/**
 * Endpoint 2
 * Przyjmuje jako body liste liczb do posortowania.
 * Odpowiedzia są posortowane liczby malejąco lub rosnąco
 * zgodnie ze wczesniejszym żądnaniem przez użytkownika
 */

@RequestMapping("/numbers")
//@CrossOrigin("http://localhost:4200") - do zadania z Angularem
@RestController
class NumbersController {

    /**
     * W @RequestBody podajemy listę liczb oraz czy ma być to rosnące czy malejące sortowanie
     * @param numbers
     * @return posortowane liczby
     */
    @PostMapping(value = "/sort-command", consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> postNumber(@RequestBody Numbers numbers) {
        List<Integer> sortedDescNumbers = numbers.numbers().stream()
                .sorted(Comparator.reverseOrder()).toList();

        List<Integer> sortedAscNumbers = numbers.numbers().stream()
                .sorted().toList();

        String asc = "numbers: " + sortedAscNumbers;
        String desc = "numbers: " + sortedDescNumbers;

        if(numbers.order().equals("ASC")) {
            return ResponseEntity.status(HttpStatus.CREATED).body(asc);
        }if(numbers.order().equals("DESC")) {
            return ResponseEntity.status(HttpStatus.CREATED).body(desc);
        }
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("400 BAD REQUEST");

    }
}
