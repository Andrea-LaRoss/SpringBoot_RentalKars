package com.example.springboot_rentalkars.service;

import com.example.springboot_rentalkars.dto.CarDto;
import com.example.springboot_rentalkars.dto.ReservationDto;
import com.example.springboot_rentalkars.entities.Reservation;

import java.time.LocalDate;
import java.util.List;

public interface ReservationService {

    public List<Reservation> selAll();

    public ReservationDto getReservationById (Long id);

    public List<CarDto> availableCars (LocalDate startDate, LocalDate endDate);

    public void delReservation (Reservation reservation);

    public void insReservation (Reservation reservation);
}
