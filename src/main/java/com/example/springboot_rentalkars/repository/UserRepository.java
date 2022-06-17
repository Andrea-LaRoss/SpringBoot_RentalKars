package com.example.springboot_rentalkars.repository;

import com.example.springboot_rentalkars.entities.User;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface UserRepository extends PagingAndSortingRepository<User, Long> {

    @Query(value = "SELECT * FROM user WHERE first_name LIKE :firstName", nativeQuery = true)
    List<User> selByFirstName(@Param("firstName") String firstName);

    List<User> selByFirstName(String firstName, Pageable pageable);

    @Query(value = "SELECT * FROM user WHERE last_name LIKE :lastName", nativeQuery = true)
    List<User> selByLastName(@Param("firstName") String lastName);

    List<User> selByLastName(String lastName, Pageable pageable);

    @Query(value = "SELECT * FROM user WHERE email LIKE :email", nativeQuery = true)
    List<User> selByEmail(@Param("firstName") String email);

    List<User> selByEmail(String email, Pageable pageable);

    @Query(value = "SELECT * FROM user WHERE id = :id", nativeQuery = true)
    User selById(@Param("id") Long id);

    @Query(value = "SELECT * FROM user WHERE email = :email", nativeQuery = true)
    User validateUser(@Param("email") String email);

}
