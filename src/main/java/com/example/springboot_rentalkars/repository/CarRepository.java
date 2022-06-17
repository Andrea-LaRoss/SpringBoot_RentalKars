package com.example.springboot_rentalkars.repository;

import com.example.springboot_rentalkars.entities.Car;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface CarRepository extends PagingAndSortingRepository<Car, Long>{

    @Query(value = "SELECT * FROM car WHERE brand LIKE :brand", nativeQuery = true)
    List<Car> selByBrand(@Param("brand") String brand);

    List<Car> selByBrand(String brand, Pageable pageable);

    @Query(value = "SELECT * FROM car WHERE model LIKE :model", nativeQuery = true)
    List<Car> selByModel(@Param("model") String model);

    List<Car> selByModel(String model, Pageable pageable);

    @Query(value = "SELECT * FROM car WHERE type LIKE :type", nativeQuery = true)
    List<Car> selByType(@Param("type") String type);

    List<Car> selByType(String type, Pageable pageable);

    @Query(value = "SELECT * FROM car WHERE num_plate LIKE :numPlate", nativeQuery = true)
    List<Car> selByNumPLate(@Param("numPlate") String numPlate);

    List<Car> selByNumPLate(String numPlate, Pageable pageable);

    Car selById(Long id);

    @Query(value = "SELECT * FROM car WHERE num_plate = :numPlate", nativeQuery = true)
    Car checkNumPlate(@Param("numPlate") String numPlate);
}
