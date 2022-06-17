package com.example.springboot_rentalkars.service;

import com.example.springboot_rentalkars.entities.Car;
import com.example.springboot_rentalkars.entities.Reservation;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ReservationService {

    public Iterable<Reservation> selAll();

    public void insReservation(Reservation reservation);

    public void delReservation(Reservation reservation);
}
