package com.example.springboot_rentalkars.service;

import com.example.springboot_rentalkars.entities.User;
import com.example.springboot_rentalkars.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import org.springframework.data.domain.Pageable;
import java.util.List;

@Service
@Transactional(readOnly = true)
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepository userRepository;

    @Override
    public Iterable<User> selAll() { return userRepository.findAll(); }

    @Override
    @Transactional
    public void insUser(User user) { userRepository.save(user); }

    @Override
    @Transactional
    public void delUser(User user) { userRepository.delete(user); }

    @Override
    public List<User> selByFirstName(String firstName) { return userRepository.selByFirstName(firstName); }

    @Override
    public List<User> selByFirstName(String firstName, Pageable pageable) { return userRepository.selByFirstName(firstName, pageable); }

    @Override
    public List<User> selByLastName(String lastName) { return userRepository.selByLastName(lastName); }

    @Override
    public List<User> selByLastName(String lastName, Pageable pageable) { return userRepository.selByLastName(lastName, pageable); }

    @Override
    public List<User> selByEmail(String email) { return userRepository.selByEmail(email); }

    @Override
    public List<User> selByEmail(String email, Pageable pageable) { return userRepository.selByEmail(email, pageable); }

    @Override
    public User selById(Long id) { return userRepository.selById(id); }

    @Override
    public User validateUser(String email) { return userRepository.validateUser(email); }

}
