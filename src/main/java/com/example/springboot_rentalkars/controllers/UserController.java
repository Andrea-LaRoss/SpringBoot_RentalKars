package com.example.springboot_rentalkars.controllers;


import com.example.springboot_rentalkars.dto.UserDto;
import com.example.springboot_rentalkars.entities.User;
import com.example.springboot_rentalkars.service.UserService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserController {

    @Autowired
    private UserService userService;

    private static final Logger logger = LoggerFactory.getLogger(UserController.class);

    @GetMapping()
    public List<User> getAllUsers() { return userService.selAll(); }


    @GetMapping("/remove")
    public void deleteUser(User user) {userService.delUser(user); }


    @GetMapping("/form/{id}")
    public ResponseEntity<UserDto> userForm(@PathVariable("id") Long id) {

        UserDto user = null;
        if(id != null) {
            user = userService.getUserById(id);
        }

        if(user == null) {
            return new ResponseEntity<UserDto>(HttpStatus.NOT_FOUND);
        } else {
            return new ResponseEntity<UserDto>(user, HttpStatus.OK);
        }

    }


    @GetMapping(value = "/check/{email}", produces = "application/json")
    public ResponseEntity<UserDto> checkNumPlate(@PathVariable("email") String email) {

        logger.info("--- Controlliamo la mail ---");

        UserDto user = userService.checkEmail(email);

        if(user == null) {
            String error ="La targa inserita non esiste";
            logger.warn(error);
            return new ResponseEntity<UserDto>(HttpStatus.NOT_FOUND);
        } else {
            return new ResponseEntity<UserDto>(user, HttpStatus.OK);
        }

    }


    @GetMapping(value = "/search/email/{value}", produces = "application/json")
    public ResponseEntity<List<UserDto>> searchEmail(@PathVariable("value") String value) {

        logger.info("--- Cerchiamo la Mail ---");
        List<UserDto> usersList = userService.searchByEmail(value);

        if(usersList == null) {
            String error = "La Mail inserita non esiste";
            logger.warn(error);
            return new ResponseEntity<List<UserDto>>(HttpStatus.NOT_FOUND);
        } else {
            return new ResponseEntity<List<UserDto>>(usersList, HttpStatus.OK);
        }

    }


    @GetMapping(value = "/search/first_name/{value}", produces = "application/json")
    public ResponseEntity<List<UserDto>> searchModel(@PathVariable("value") String value) {

        logger.info("--- Controlliamo il Nome ---");

        List<UserDto> usersList = userService.searchByFirstName(value);

        if(usersList == null) {
            String error = "Il Nome inserito non esiste";
            logger.warn(error);
            return new ResponseEntity<List<UserDto>>(HttpStatus.NOT_FOUND);
        } else {
            return new ResponseEntity<List<UserDto>>(usersList, HttpStatus.OK);
        }

    }


    @GetMapping(value = "/search/last_name/{value}", produces = "application/json")
    public ResponseEntity<List<UserDto>> searchType(@PathVariable("value") String value) {

        logger.info("--- Controlliamo il Cognome ---");

        List<UserDto> usersList = userService.searchByLastName(value);

        if(usersList == null) {
            String error = "Il Cognome inserito non esiste";
            logger.warn(error);
            return new ResponseEntity<List<UserDto>>(HttpStatus.NOT_FOUND);
        } else {
            return new ResponseEntity<List<UserDto>>(usersList, HttpStatus.OK);
        }

    }


    @GetMapping(value = "/search/birthday/{value}", produces = "application/json")
    public ResponseEntity<List<UserDto>> searchNumPlate(@PathVariable("value") String value) {

        logger.info("--- Controlliamo la data di nascita ---");

        List<UserDto> usersList = userService.searchByBirthday(value);

        if(usersList == null) {
            String error = "La data di nascita inserita non esiste";
            logger.warn(error);
            return new ResponseEntity<List<UserDto>>(HttpStatus.NOT_FOUND);
        } else {
            return new ResponseEntity<List<UserDto>>(usersList, HttpStatus.OK);
        }

    }
}
