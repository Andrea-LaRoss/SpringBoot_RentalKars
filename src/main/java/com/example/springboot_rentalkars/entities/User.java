package com.example.springboot_rentalkars.entities;

import lombok.Data;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Set;

@Entity
@Table(name = "user")
@Data
public class User {

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
    @JsonManagedReference
    private Set<Reservation> reservations;


    public User(){}


    public User(String email, String password, String firstName, String lastName, LocalDate birthday, boolean isAdmin) {
        this.email = email;
        this.password = password;
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthday = birthday;
        this.admin = isAdmin;
    }

}
