package com.example.springboot_rentalkars.service;

import com.example.springboot_rentalkars.entities.Car;
import com.example.springboot_rentalkars.entities.Reservation;
import com.example.springboot_rentalkars.repository.ReservationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class ReservationServiceImpl implements ReservationService{

    @Autowired
    ReservationRepository reservationRepository;

    @Override
    public List<Reservation> selAll() { return reservationRepository.findAll(); }

    @Override
    public List<Car> availableCars(LocalDate startDate, LocalDate endDate) { return reservationRepository.availableCars(startDate, endDate); }

    @Override
    public void delReservation(Reservation reservation) { reservationRepository.delete(reservation); }

    @Override
    public void insReservation(Reservation reservation) { reservationRepository.save(reservation); }

}
