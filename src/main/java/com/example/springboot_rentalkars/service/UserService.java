package com.example.springboot_rentalkars.service;

import com.example.springboot_rentalkars.dto.CarDto;
import com.example.springboot_rentalkars.dto.UserDto;
import com.example.springboot_rentalkars.entities.User;

import java.util.List;

public interface UserService {

    public List<User> selAll();

    public UserDto getUserById(Long id);

    public List<UserDto> searchByEmail(String email);

    public List<UserDto> searchByFirstName(String firstName);

    public List<UserDto> searchByLastName(String lastName);

    public List<UserDto> searchByBirthday(String birthday);

    public UserDto checkEmail(String email);

    public void delUser(User user);

    public void insUser(User user);

}
