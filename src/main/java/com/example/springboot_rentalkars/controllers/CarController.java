package com.example.springboot_rentalkars.controllers;

import com.example.springboot_rentalkars.dto.CarDto;
import com.example.springboot_rentalkars.entities.Car;
import com.example.springboot_rentalkars.service.CarService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/cars")
public class CarController {

    @Autowired
    private CarService carService;

    private static final Logger logger = LoggerFactory.getLogger(CarController.class);


    @GetMapping()
    public Iterable<Car> getAllCars() {
        return carService.selAll();
    }


    @GetMapping("/remove")
    public void deleteCar(Car car) {
        carService.delCar(car);
    }


    @GetMapping("/submitform")
    public void saveCar(Car car) {
        carService.insCar(car);
    }


    @GetMapping(value = "/check/{numplate}", produces = "application/json")
    public ResponseEntity<CarDto> checkNumPlate(@PathVariable("numplate") String numPlate) {

        logger.info("--- Controlliamo la targa ---");

        CarDto car = carService.checkPlate(numPlate);

        if(car == null) {
            String error = String.format("La targa inserita non esiste");
            logger.warn(error);
            return new ResponseEntity<CarDto>(HttpStatus.NOT_FOUND);
        } else {
            return new ResponseEntity<CarDto>(car, HttpStatus.OK);
        }

    }


    @GetMapping(value = "/search/brand/{value}", produces = "application/json")
    public ResponseEntity<List<CarDto>> searchBrand(@PathVariable("value") String value) {

        logger.info("--- Controlliamo la targa ---");

        List<CarDto> carsList = carService.searchCarByBrand(value);

        if(carsList == null) {
            String error = String.format("La targa inserita non esiste");
            logger.warn(error);
            return new ResponseEntity<List<CarDto>>(HttpStatus.NOT_FOUND);
        } else {
            return new ResponseEntity<List<CarDto>>(carsList, HttpStatus.OK);
        }

    }


    @GetMapping(value = "/search/model/{value}", produces = "application/json")
    public ResponseEntity<List<CarDto>> searchModel(@PathVariable("value") String value) {

        logger.info("--- Controlliamo la targa ---");

        List<CarDto> carsList = carService.searchCarByModel(value);

        if(carsList == null) {
            String error = String.format("La targa inserita non esiste");
            logger.warn(error);
            return new ResponseEntity<List<CarDto>>(HttpStatus.NOT_FOUND);
        } else {
            return new ResponseEntity<List<CarDto>>(carsList, HttpStatus.OK);
        }

    }


    @GetMapping(value = "/search/type/{value}", produces = "application/json")
    public ResponseEntity<List<CarDto>> searchType(@PathVariable("value") String value) {

        logger.info("--- Controlliamo la targa ---");

        List<CarDto> carsList = carService.searchCarByType(value);

        if(carsList == null) {
            String error = String.format("La targa inserita non esiste");
            logger.warn(error);
            return new ResponseEntity<List<CarDto>>(HttpStatus.NOT_FOUND);
        } else {
            return new ResponseEntity<List<CarDto>>(carsList, HttpStatus.OK);
        }

    }


    @GetMapping(value = "/search/numplate/{value}", produces = "application/json")
    public ResponseEntity<List<CarDto>> searchNumPlate(@PathVariable("value") String value) {

        logger.info("--- Controlliamo la targa ---");

        List<CarDto> carsList = carService.searchCarByNumPlate(value);

        if(carsList == null) {
            String error = String.format("La targa inserita non esiste");
            logger.warn(error);
            return new ResponseEntity<List<CarDto>>(HttpStatus.NOT_FOUND);
        } else {
            return new ResponseEntity<List<CarDto>>(carsList, HttpStatus.OK);
        }

    }


    @GetMapping(value = "/search/regdate/{value}", produces = "application/json")
    public ResponseEntity<List<CarDto>> searchRegDate(@PathVariable("value") String value) {

        logger.info("--- Controlliamo la targa ---");

        List<CarDto> carsList = carService.searchCarByRegDate(value);

        if(carsList == null) {
            String error = String.format("La targa inserita non esiste");
            logger.warn(error);
            return new ResponseEntity<List<CarDto>>(HttpStatus.NOT_FOUND);
        } else {
            return new ResponseEntity<List<CarDto>>(carsList, HttpStatus.OK);
        }

    }
}
