package com.example.springboot_rentalkars.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/cars")
public class CarController {

    @GetMapping()
    public String getCars() {
        return "Auto ottenute";
    }

}
