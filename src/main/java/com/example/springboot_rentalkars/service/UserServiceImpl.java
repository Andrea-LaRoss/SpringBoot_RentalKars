package com.example.springboot_rentalkars.service;

import com.example.springboot_rentalkars.entities.User;
import com.example.springboot_rentalkars.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    UserRepository userRepository;

    @Override
    public List<User> selAll() { return userRepository.findAll(); }

    @Override
    public List<User> searchByEmail(String email) { return userRepository.searchByEmail(email); }

    @Override
    public List<User> searchByFirstName(String firstName) { return userRepository.searchByFirstName(firstName); }

    @Override
    public List<User> searchByLastName(String lastName) { return userRepository.searchByLastName(lastName); }

    @Override
    public List<User> searchByBirthday(String birthday) { return userRepository.searchByBirthday(birthday); }

    @Override
    public User checkEmail(String email) { return userRepository.checkEmail(email); }

    @Override
    public void delUser(User user) { userRepository.delete(user); }

    @Override
    public void insUser(User user) { userRepository.save(user); }

}
