package com.example.springboot_rentalkars.dto;

import com.example.springboot_rentalkars.entities.Car;
import com.example.springboot_rentalkars.entities.User;
import lombok.Data;

import java.time.LocalDate;

@Data
public class ReservationDto {

    private long id;
    private LocalDate startDate;
    private LocalDate endDate;
    private String status;

    private User user;
    private Car car;
}
