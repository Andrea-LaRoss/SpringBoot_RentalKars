package com.example.springboot_rentalkars.service;

import com.example.springboot_rentalkars.entities.Reservation;
import com.example.springboot_rentalkars.repository.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional(readOnly = true)
public class ReservationServiceImpl implements ReservationService{
}
