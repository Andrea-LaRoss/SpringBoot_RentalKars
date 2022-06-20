package com.example.springboot_rentalkars.dto;

import lombok.Data;

import java.time.LocalDate;

@Data
public class CarDto {

    private Long id;
    private String brand;
    private String model;
    private String type;
    private String numPlate;
    private LocalDate regDate;

    //private Set<Reservation> reservation = new HashSet<>();
}
