package com.example.springboot_rentalkars.repository;

import com.example.springboot_rentalkars.entities.Car;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface CarRepository extends JpaRepository<Car, Long>{

    @Query(value = "SELECT * FROM car WHERE manufacturer LIKE :brand", nativeQuery = true)
    List<Car> searchCarByBrand(@Param("brand") String brand);

    @Query(value = "SELECT * FROM car WHERE model LIKE :model", nativeQuery = true)
    List<Car> searchCarByModel(@Param("model") String model);

    @Query(value = "SELECT * FROM car WHERE type LIKE :type", nativeQuery = true)
    List<Car> searchCarByType(@Param("type") String type);

    @Query(value = "SELECT * FROM car WHERE num_plate LIKE :numPlate", nativeQuery = true)
    List<Car> searchCarByNumPlate(@Param("num_plate") String numPlate);

    @Query(value = "SELECT * FROM car WHERE reg_date LIKE :regDate", nativeQuery = true)
    List<Car> searchCarByRegDate(@Param("reg_date") String regDate);

    @Query(value = "SELECT * FROM car WHERE num_plate LIKE :numPlate", nativeQuery = true)
    Car checkPlate(@Param("num_plate") String numPlate);

}
