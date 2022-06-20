package com.example.springboot_rentalkars.service;

import com.example.springboot_rentalkars.entities.Car;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface CarService {

    public Iterable<Car>selAll();

    public List<Car> searchCarByBrand(String brand);

    public List<Car> searchCarByModel(String model);

    public List<Car> searchCarByType(String type);

    public List<Car> searchCarByNumPlate(String numPlate);

    public List<Car> searchCarByRegDate(String regDate);

    public Car checkPlate(String numPlate);

    public void delCar(Car car);

    public void insCar(Car car);
}
