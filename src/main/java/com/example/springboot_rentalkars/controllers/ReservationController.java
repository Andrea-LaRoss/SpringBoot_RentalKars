package com.example.springboot_rentalkars.controllers;

import com.example.springboot_rentalkars.dto.CarDto;
import com.example.springboot_rentalkars.dto.ReservationDto;
import com.example.springboot_rentalkars.dto.UserDto;
import com.example.springboot_rentalkars.entities.Reservation;
import com.example.springboot_rentalkars.entities.User;
import com.example.springboot_rentalkars.service.CarService;
import com.example.springboot_rentalkars.service.ReservationService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("/api/reservation")
public class ReservationController {

    @Autowired
    private ReservationService reservationService;

    @Autowired
    private CarService carService;

    private static final Logger logger = LoggerFactory.getLogger(ReservationController.class);


    @GetMapping()
    public List<Reservation> getAllReservations() { return reservationService.selAll(); }


    @GetMapping("/remove")
    public void deleteReservation(Reservation reservation) { reservationService.delReservation(reservation); }


    @GetMapping("/form/{id}")
    public ResponseEntity<ReservationDto> userForm(@PathVariable("id") Long id) {

        ReservationDto reservation = null;
        if(id != null) {
            reservation = reservationService.getReservationById(id);
        }

        if(reservation == null) {
            return new ResponseEntity<ReservationDto>(HttpStatus.NOT_FOUND);
        } else {
            return new ResponseEntity<ReservationDto>(reservation, HttpStatus.OK);
        }

    }


    @GetMapping(value = "/available", produces = "application/json")
    public ResponseEntity<List<CarDto>> searchModel(@RequestParam(name="startDate") LocalDate startDate, @RequestParam(name="endDate") LocalDate endDate) {

        List<CarDto> carsList = reservationService.availableCars(startDate, endDate);

        if(carsList == null) {
            String error = "Nessuna Auto Disponibile";
            logger.warn(error);
            return new ResponseEntity<List<CarDto>>(HttpStatus.NOT_FOUND);
        } else {
            return new ResponseEntity<List<CarDto>>(carsList, HttpStatus.OK);
        }

    }
}
