package com.example.springboot_rentalkars.service;

import com.example.springboot_rentalkars.entities.User;

import org.springframework.data.domain.Pageable;
import java.util.List;

public interface UserService {

    public Iterable<User> selAll();

    public void insUser(User user);

    public void delUser(User user);

    List<User> selByFirstName(String firstName);

    List<User> selByFirstName(String firstName, Pageable pageable);

    List<User> selByLastName(String lastName);

    List<User> selByLastName(String lastName, Pageable pageable);

    List<User> selByEmail(String email);

    List<User> selByEmail(String email, Pageable pageable);

    User selById(Long id);

    User validateUser(String email);
}
