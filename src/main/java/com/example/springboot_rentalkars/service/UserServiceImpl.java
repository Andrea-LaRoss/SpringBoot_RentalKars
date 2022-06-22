package com.example.springboot_rentalkars.service;


import com.example.springboot_rentalkars.dto.UserDto;
import com.example.springboot_rentalkars.entities.User;
import com.example.springboot_rentalkars.repository.UserRepository;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    UserRepository userRepository;

    @Autowired
    private ModelMapper modelMapper;


    @Override
    public List<User> selAll() { return userRepository.findAll(); }


    @Override
    public UserDto getUserById(Long id) {
        Optional<User> user = userRepository.findById(id);
        UserDto userDto = modelMapper.map(user, UserDto.class);
        return userDto;
    }


    @Override
    public List<UserDto> searchByEmail(String email) {
        List<User> usersList = userRepository.searchByEmail(email);
        return this.convertToDtoList(usersList);
    }


    @Override
    public List<UserDto> searchByFirstName(String firstName) {
        List<User> usersList = userRepository.searchByFirstName(firstName);
        return this.convertToDtoList(usersList);
    }


    @Override
    public List<UserDto> searchByLastName(String lastName) {
        List<User> usersList = userRepository.searchByLastName(lastName);
        return this.convertToDtoList(usersList);
    }


    @Override
    public List<UserDto> searchByBirthday(String birthday) {
        List<User> usersList = userRepository.searchByBirthday(birthday);
        return this.convertToDtoList(usersList);
    }


    @Override
    public UserDto checkEmail(String email) {
        User user = userRepository.checkEmail(email);
        return this.convertToDto(user);
    }


    @Override
    public void delUser(User user) { userRepository.delete(user); }


    @Override
    public void insUser(User user) { userRepository.save(user); }


    private UserDto convertToDto(User user) {

        UserDto userDto = null;
        if (user != null) {
            userDto =  modelMapper.map(user, UserDto.class);
        }
        return userDto;

    }


    private List<UserDto> convertToDtoList(List<User> usersList) {

        List<UserDto> usersDto = new ArrayList<>();

        if (usersList != null) {
            usersDto = usersList
                    .stream()
                    .map(source -> modelMapper.map(source, UserDto.class))
                    .collect(Collectors.toList());
        }

        return usersDto;

    }

}
