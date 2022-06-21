package com.example.springboot_rentalkars.controllers;

import com.example.springboot_rentalkars.entities.Car;
import com.example.springboot_rentalkars.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/cars")
public class CarController {

    @Autowired
    private CarService carService;


    @GetMapping()
    public Iterable<Car> getAllCars() {
        return carService.selAll();
    }


    @GetMapping("/remove")
    public void deleteCar(Car car) {
        carService.delCar(car);
    }

    @GetMapping("/submitform")
    public void saveCar(Car car) {
        carService.insCar(car);
    }
}
