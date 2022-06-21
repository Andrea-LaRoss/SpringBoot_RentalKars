package com.example.springboot_rentalkars.service;

import com.example.springboot_rentalkars.dto.CarDto;
import com.example.springboot_rentalkars.entities.Car;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface CarService {

    public Iterable<Car>selAll();

    public List<CarDto> searchCarByBrand(String brand);

    public List<CarDto> searchCarByModel(String model);

    public List<CarDto> searchCarByType(String type);

    public List<CarDto> searchCarByNumPlate(String numPlate);

    public List<CarDto> searchCarByRegDate(String regDate);

    public CarDto checkPlate(String numPlate);

    public void delCar(Car car);

    public void insCar(Car car);
}
