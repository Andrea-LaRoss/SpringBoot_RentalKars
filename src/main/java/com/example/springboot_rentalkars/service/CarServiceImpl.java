package com.example.springboot_rentalkars.service;

import com.example.springboot_rentalkars.config.HibernateConfig;
import com.example.springboot_rentalkars.entities.Car;
import com.example.springboot_rentalkars.repository.CarRepository;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Service
@Transactional(readOnly = true)
public class CarServiceImpl implements CarService{

    @Autowired
    private CarRepository carRepository;

    @Override
    public Iterable<Car> selAll() { return carRepository.findAll(); }

    @Override
    public List<Car> searchCarByBrand(String brand) {
        return carRepository.searchCarByBrand(brand);
    }

    @Override
    public List<Car> searchCarByModel(String model) { return null; }

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
