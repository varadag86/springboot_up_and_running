package com.sbuar.ch1.controllers;

import com.sbuar.ch1.models.CoffeeDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/v1/coffee")
public class CoffeeShop {

    private final List<CoffeeDTO> coffeeList = List.of(
            new CoffeeDTO(1L, "Mocha"),
            new CoffeeDTO(2L, "Latte"),
            new CoffeeDTO(3L, "Black Coffee")
    );

    @GetMapping("")
    public ResponseEntity<Iterable<CoffeeDTO>> getAllCoffeeTypes() {
        return new ResponseEntity<>(coffeeList, HttpStatus.OK);
    }

    @GetMapping("/{name}")
    public ResponseEntity<CoffeeDTO> getAllCoffeeById(@PathVariable String name) {
        List<CoffeeDTO> response = coffeeList.stream().filter(coffeeDTO -> coffeeDTO.getName().equalsIgnoreCase(name)).toList();
        if(response.size() > 0) {
            return new ResponseEntity<>(response.get(0), HttpStatus.OK);
        }

        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
