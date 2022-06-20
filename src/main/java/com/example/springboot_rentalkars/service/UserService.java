package com.example.springboot_rentalkars.service;

import com.example.springboot_rentalkars.entities.User;

import java.util.List;

public interface UserService {

    public List<User> selAll();

    public List<User> searchByEmail(String email);

    public List<User> searchByFirstName(String firstName);

    public List<User> searchByLastName(String lastName);

    public List<User> searchByBirthday(String birthday);

    public User checkEmail(String email);

    public void delUser(User user);

    public void insUser(User user);

}
