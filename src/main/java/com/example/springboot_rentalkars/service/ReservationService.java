package com.example.springboot_rentalkars.service;

import com.example.springboot_rentalkars.entities.Car;
import com.example.springboot_rentalkars.entities.Reservation;
import com.example.springboot_rentalkars.entities.User;

import java.time.LocalDate;
import java.util.List;

public interface ReservationService {

    public List<Reservation> selAll();

    List<Car> availableCars(LocalDate startDate, LocalDate endDate);

    public void delReservation(Reservation reservation);

    public void insReservation(Reservation reservation);
}
