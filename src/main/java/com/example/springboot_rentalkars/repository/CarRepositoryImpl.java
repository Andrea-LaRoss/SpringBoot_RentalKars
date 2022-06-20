package com.example.springboot_rentalkars.repository;

import com.example.springboot_rentalkars.entities.Car;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Repository
@Transactional
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

    @Override
    public Iterable<Car> findAll(Sort sort) {
        return null;
    }

    @Override
    public Page<Car> findAll(Pageable pageable) {
        return null;
    }

    @Override
    public Car save(Car car) {
        return null;
    }

    @Override
    public <S extends Car> Iterable<S> saveAll(Iterable<S> entities) {
        return null;
    }

    @Override
    public Optional<Car> findById(Long aLong) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(Long id) {
        return false;
    }

    @Override
    public Iterable<Car> findAll() {
        return null;
    }

    @Override
    public Iterable<Car> findAllById(Iterable<Long> longs) {
        return null;
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void deleteById(Long aLong) {

    }

    @Override
    public void delete(Car entity) {

    }

    @Override
    public void deleteAllById(Iterable<? extends Long> longs) {

    }

    @Override
    public void deleteAll(Iterable<? extends Car> entities) {

    }

    @Override
    public void deleteAll() {

    }

}
