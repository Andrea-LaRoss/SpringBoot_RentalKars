package com.example.springboot_rentalkars.repository;

import com.example.springboot_rentalkars.entities.Car;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface CarRepository extends JpaRepository<Car, Long>{

    List<Car> searchCarByBrand(String brand);

    List<Car> searchCarByModel(String model);

    List<Car> searchCarByType(String type);

    List<Car> searchCarByNumPlate(String numPlate);

    List<Car> searchCarByRegDate(String regDate);

    Car checkPlate(String numPlate);

}
