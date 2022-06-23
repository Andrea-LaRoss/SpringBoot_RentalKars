package com.example.springboot_rentalkars.repository;

import com.example.springboot_rentalkars.entities.Car;
import com.example.springboot_rentalkars.entities.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.time.LocalDate;
import java.util.List;

public interface ReservationRepository extends JpaRepository<Reservation, Long> {

    @Query(value = "Select c.* from test.rent r INNER JOIN test.car c on c.id = r.car_id where r.start_date between :startDate and :endDate or r.end_date between :startDate and :endDate", nativeQuery = true)
    List<Car> availableCars(@Param("startDate")LocalDate startDate, @Param("endDate") LocalDate endDate);

}
