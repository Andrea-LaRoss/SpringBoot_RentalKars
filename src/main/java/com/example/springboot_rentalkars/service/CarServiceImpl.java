package com.example.springboot_rentalkars.service;

import com.example.springboot_rentalkars.entities.Car;
import com.example.springboot_rentalkars.repository.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional(readOnly = true)
public class CarServiceImpl implements CarService{

    @Autowired
    CarRepository carRepository;

    @Override
    public Iterable<Car> selAll() { return carRepository.findAll(); }

    @Override
    @Transactional
    public void insCar(Car car) { carRepository.save(car); }

    @Override
    @Transactional
    public void delCar(Car car) { carRepository.delete(car); }

    @Override
    public List<Car> selByBrand(String brand) { return carRepository.selByBrand(brand); }

    @Override
    public List<Car> selByBrand(String brand, Pageable pageable) { return carRepository.selByBrand(brand, pageable); }

    @Override
    public List<Car> selByModel(String model) { return carRepository.selByModel(model); }

    @Override
    public List<Car> selByModel(String model, Pageable pageable) { return carRepository.selByModel(model, pageable); }

    @Override
    public List<Car> selByType(String type) { return carRepository.selByType(type); }

    @Override
    public List<Car> selByType(String type, Pageable pageable) { return carRepository.selByType(type, pageable); }

    @Override
    public List<Car> selByNumPLate(String numPlate) { return selByNumPLate(numPlate); }

    @Override
    public List<Car> selByNumPLate(String numPlate, Pageable pageable) { return carRepository.selByNumPLate(numPlate, pageable); }

    @Override
    public Car selById(Long id) { return carRepository.selById(id); }

    @Override
    public Car checkNumPlate(String numPlate) { return carRepository.checkNumPlate(numPlate); }
}
