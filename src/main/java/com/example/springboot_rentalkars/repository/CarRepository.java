package com.example.springboot_rentalkars.repository;

import com.example.springboot_rentalkars.entities.Car;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface CarRepository extends PagingAndSortingRepository<Car, Long> {

    @Query("select * from car where manufacturer like :brand")
    List<Car> searchCarByBrand(@Param("brand") String brand);

    List<Car> searchCarByModel(String model);

    Car checkPlate(String numPlate);
}
