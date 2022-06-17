package com.example.springboot_rentalkars.repository;

import com.example.springboot_rentalkars.entities.Reservation;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface ReservationRepository extends PagingAndSortingRepository<Reservation, Long> {

    @Query(value = "SELECT * FROM rent WHERE brand LIKE :brand", nativeQuery = true)

}
