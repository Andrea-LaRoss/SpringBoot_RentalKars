package com.example.springboot_rentalkars.repository;

import com.example.springboot_rentalkars.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepository extends JpaRepository<User, Long> {

    List<User> searchByEmail(String email);

    List<User> searchByFirstName(String firstName);

    List<User> searchByLastName(String lastName);

    List<User> searchByBirthday(String birthday);

    User checkEmail(String email);

}
