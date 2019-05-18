package com.noyman.amit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;


@SpringBootApplication
@EnableAutoConfiguration(exclude = {SecurityAutoConfiguration.class})
public class FlightApp {

    /**
     * Run application
     * @param args arguments to run application with
     */
    public static void main(String[] args) {
        SpringApplication sa = new SpringApplication(FlightApp.class);
        sa.run(args);
    }
}
