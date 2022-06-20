package com.example.springboot_rentalkars;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class SpringBootRentalKarsApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootRentalKarsApplication.class, args);
    }

}
