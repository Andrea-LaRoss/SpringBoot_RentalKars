package com.example.springboot_rentalkars.service;

import com.example.springboot_rentalkars.dto.CarDto;
import com.example.springboot_rentalkars.entities.Car;
import com.example.springboot_rentalkars.repository.CarRepository;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
@Transactional(readOnly = true)
public class CarServiceImpl implements CarService{

    @Autowired
    private CarRepository carRepository;

    @Autowired
    private ModelMapper modelMapper;


    @Override
    public Iterable<Car> selAll() { return carRepository.findAll(); }


    @Override
    public List<CarDto> searchCarByBrand(String brand) {

        List<Car> carsList = carRepository.searchCarByBrand(brand);
        List<CarDto> retVal = carsList
                .stream()
                .map(source -> modelMapper.map(source, CarDto.class))
                .collect(Collectors.toList());
        return retVal;

    }


    @Override
    public List<CarDto> searchCarByModel(String model) {

        List<Car> carsList = carRepository.searchCarByModel(model);
        List<CarDto> retVal = carsList
                .stream()
                .map(source -> modelMapper.map(source, CarDto.class))
                .collect(Collectors.toList());
        return retVal;

    }


    @Override
    public List<CarDto> searchCarByType(String type) {

        List<Car> carsList = carRepository.searchCarByType(type);
        List<CarDto> retVal = carsList
                .stream()
                .map(source -> modelMapper.map(source, CarDto.class))
                .collect(Collectors.toList());
        return retVal;

    }


    @Override
    public List<CarDto> searchCarByNumPlate(String numPlate) {

        List<Car> carsList = carRepository.searchCarByNumPlate(numPlate);
        List<CarDto> retVal = carsList
                .stream()
                .map(source -> modelMapper.map(source, CarDto.class))
                .collect(Collectors.toList());
        return retVal;

    }


    @Override
    public List<CarDto> searchCarByRegDate(String regDate) {

        List<Car> carsList = carRepository.searchCarByRegDate(regDate);
        List<CarDto> retVal = carsList
                .stream()
                .map(source -> modelMapper.map(source, CarDto.class))
                .collect(Collectors.toList());
        return retVal;

    }


    @Override
    public CarDto checkPlate(String numPlate) {

        Car car = carRepository.checkPlate(numPlate);
        CarDto carDto = modelMapper.map(car, CarDto.class);
        return carDto;

    }


    @Override
    public void delCar(Car car) { carRepository.delete(car); }


    @Override
    public void insCar(Car car) { carRepository.save(car); }

}
