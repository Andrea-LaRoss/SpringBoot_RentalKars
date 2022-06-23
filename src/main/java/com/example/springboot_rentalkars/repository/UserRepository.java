package com.example.springboot_rentalkars.repository;

import com.example.springboot_rentalkars.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface UserRepository extends JpaRepository<User, Long> {

    @Query(value = "SELECT * FROM user WHERE email LIKE :email", nativeQuery = true)
    List<User> searchByEmail(@Param("email") String email);

    @Query(value = "SELECT * FROM user WHERE first_name LIKE :firstName", nativeQuery = true)
    List<User> searchByFirstName(@Param("firstName") String firstName);

    @Query(value = "SELECT * FROM user WHERE last_name LIKE :lastName", nativeQuery = true)
    List<User> searchByLastName(@Param("lastName") String lastName);

    @Query(value = "SELECT * FROM user WHERE birthday LIKE :birthday", nativeQuery = true)
    List<User> searchByBirthday(@Param("birthday") String birthday);

    @Query(value = "SELECT * FROM user WHERE DESCRIZIONE = :email", nativeQuery = true)
    User checkEmail(@Param("email") String email);

}
