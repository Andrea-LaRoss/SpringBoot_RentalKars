package com.example.springboot_rentalkars.service;

import org.springframework.data.repository.PagingAndSortingRepository;


public class UserServiceImpl implements UserService extends PagingAndSortingRepository<User, Long>{

}
