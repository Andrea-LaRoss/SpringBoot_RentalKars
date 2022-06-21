package com.example.springboot_rentalkars;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
@EnableJpaRepositories(basePackages = {"com.example.springboot_rentalkars.repository"})
@EntityScan(basePackages = {"com.example.springboot_rentalkars.entities"} )
public class SpringBootRentalKarsApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootRentalKarsApplication.class, args);
    }

}
