package com.example.springboot_rentalkars.entities;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "rent")
@Data
public class Reservation implements Serializable {



}
