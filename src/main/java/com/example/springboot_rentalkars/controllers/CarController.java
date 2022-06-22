package com.example.springboot_rentalkars.controllers;

import com.example.springboot_rentalkars.dto.CarDto;
import com.example.springboot_rentalkars.entities.Car;
import com.example.springboot_rentalkars.service.CarService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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
    public void deleteCar(Car car) { carService.delCar(car); }


    @GetMapping("/form/{id}")
    public ResponseEntity<CarDto> carForm(@PathVariable("id") Long id) {

        CarDto car = null;
        if(id != null) {
            car = carService.getCarById(id);
        }

        if(car == null) {
            return new ResponseEntity<CarDto>(HttpStatus.NOT_FOUND);
        } else {
            return new ResponseEntity<CarDto>(car, HttpStatus.OK);
        }

    }


    @GetMapping(value = "/check/{numplate}", produces = "application/json")
    public ResponseEntity<CarDto> checkNumPlate(@PathVariable("numplate") String numPlate) {

        logger.info("--- Controlliamo la targa ---");

        CarDto car = carService.checkPlate(numPlate);

        if(car == null) {
            String error ="La targa inserita non esiste";
            logger.warn(error);
            return new ResponseEntity<CarDto>(HttpStatus.NOT_FOUND);
        } else {
            return new ResponseEntity<CarDto>(car, HttpStatus.OK);
        }

    }


    @GetMapping(value = "/search/brand/{value}", produces = "application/json")
    public ResponseEntity<List<CarDto>> searchBrand(@PathVariable("value") String value) {

        logger.info("--- Cerchiamo la Marca ---");
        List<CarDto> carsList = carService.searchCarByBrand(value);

        if(carsList == null) {
            String error = "La marca inserita non esiste";
            logger.warn(error);
            return new ResponseEntity<List<CarDto>>(HttpStatus.NOT_FOUND);
        } else {
            return new ResponseEntity<List<CarDto>>(carsList, HttpStatus.OK);
        }

    }


    @GetMapping(value = "/search/model/{value}", produces = "application/json")
    public ResponseEntity<List<CarDto>> searchModel(@PathVariable("value") String value) {

        logger.info("--- Controlliamo il modello ---");

        List<CarDto> carsList = carService.searchCarByModel(value);

        if(carsList == null) {
            String error = "Il modello inserito non esiste";
            logger.warn(error);
            return new ResponseEntity<List<CarDto>>(HttpStatus.NOT_FOUND);
        } else {
            return new ResponseEntity<List<CarDto>>(carsList, HttpStatus.OK);
        }

    }


    @GetMapping(value = "/search/type/{value}", produces = "application/json")
    public ResponseEntity<List<CarDto>> searchType(@PathVariable("value") String value) {

        logger.info("--- Controlliamo il tipo ---");

        List<CarDto> carsList = carService.searchCarByType(value);

        if(carsList == null) {
            String error = "Il tipo inserito non esiste";
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
            String error = "La targa inserita non esiste";
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
            String error = "La targa inserita non esiste";
            logger.warn(error);
            return new ResponseEntity<List<CarDto>>(HttpStatus.NOT_FOUND);
        } else {
            return new ResponseEntity<List<CarDto>>(carsList, HttpStatus.OK);
        }

    }
}
