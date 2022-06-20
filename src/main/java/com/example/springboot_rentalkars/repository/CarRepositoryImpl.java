package com.example.springboot_rentalkars.repository;

import com.example.springboot_rentalkars.entities.Car;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

@Repository
public class CarRepositoryImpl implements CarRepository{
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

}
