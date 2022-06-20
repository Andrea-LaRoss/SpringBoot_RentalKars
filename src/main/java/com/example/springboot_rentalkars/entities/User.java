package com.example.springboot_rentalkars.entities;

import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.Set;

@Entity
@Table(name = "user")
@Data
public class User implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;


    @Column(name = "email", nullable = false, length = 128, unique = true)
    private String email;


    @Column(name = "password", nullable = false)
    private String password;


    @Column(name = "first_name", nullable = false)
    private String firstName;


    @Column(name = "last_name", nullable = false)
    private String lastName;


    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
    @Column(name = "birthday")
    private LocalDate birthday;


    @Column(name = "is_admin", nullable = false)
    private boolean admin;


    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<Reservation> reservations;

}
