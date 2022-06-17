package com.example.springboot_rentalkars.service;

import com.example.springboot_rentalkars.entities.Car;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface CarService {

    public Iterable<Car> selAll();

    public void insCar(Car car);

    public void delCar(Car car);

    List<Car> selByBrand(String brand);

    List<Car> selByBrand(String brand, Pageable pageable);

    List<Car> selByModel(String model);

    List<Car> selByModel(String model, Pageable pageable);

    List<Car> selByType(String type);

    List<Car> selByType(String type, Pageable pageable);

    List<Car> selByNumPLate(String numPlate);

    List<Car> selByNumPLate(String numPlate, Pageable pageable);

    Car selById(Long id);

    Car checkNumPlate(String numPlate);
}
