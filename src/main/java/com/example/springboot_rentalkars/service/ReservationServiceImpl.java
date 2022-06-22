package com.example.springboot_rentalkars.service;

import com.example.springboot_rentalkars.dto.CarDto;
import com.example.springboot_rentalkars.entities.Car;
import com.example.springboot_rentalkars.entities.Reservation;
import com.example.springboot_rentalkars.repository.ReservationRepository;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class ReservationServiceImpl implements ReservationService{

    @Autowired
    ReservationRepository reservationRepository;

    @Autowired
    ModelMapper modelMapper;

    @Override
    public List<Reservation> selAll() { return reservationRepository.findAll(); }

    @Override
    public List<CarDto> availableCars(LocalDate startDate, LocalDate endDate) {
        List<Car> carsList = reservationRepository.availableCars(startDate, endDate);
        return this.convertToDtoList(carsList);
    }


    @Override
    public void delReservation(Reservation reservation) { reservationRepository.delete(reservation); }

    @Override
    public void insReservation(Reservation reservation) { reservationRepository.save(reservation); }


    private List<CarDto> convertToDtoList(List<Car> carsList) {

        List<CarDto> carsDto = new ArrayList<>();
        if (carsList != null) {
            carsDto = carsList
                    .stream()
                    .map(source -> modelMapper.map(source, CarDto.class))
                    .collect(Collectors.toList());
        }

        return carsDto;

    }


}
