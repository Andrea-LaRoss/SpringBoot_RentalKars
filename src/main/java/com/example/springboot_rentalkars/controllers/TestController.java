package com.example.springboot_rentalkars.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/test")
public class TestController {

    @GetMapping()
    public String getTest() {
        return "The cake is a lie";
    }

    @GetMapping("/{nome}")
    public String getParametri(@PathVariable ("nome") String nome) {
        return "Ciao " + nome + ", il passaggio è avvenuto con successo";
    }
}
