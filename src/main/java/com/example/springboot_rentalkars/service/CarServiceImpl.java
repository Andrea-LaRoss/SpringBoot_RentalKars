package com.example.springboot_rentalkars.service;

import com.example.springboot_rentalkars.entities.Car;
import com.example.springboot_rentalkars.repository.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional(readOnly = true)
public class CarServiceImpl implements CarService{

    @Autowired
    CarRepository carRepository;

    @Override
    public Iterable<Car> selAll() {
        return null;
    }

    @Override
    public List<Car> searchCarByBrand(String brand) {
        return null;
    }

    @Override
    public List<Car> searchCarByModel(String model) {
        return null;
    }

    @Override
    public Car checkPlate(String numPlate) {
        return null;
    }

    @Override
    public void delCar(Car car) {

    }

    @Override
    public void insCar(Car car) {

    }
}
