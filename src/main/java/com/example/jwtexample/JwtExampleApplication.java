package com.example.jwtexample;

import jakarta.annotation.PostConstruct;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;

@SpringBootApplication
public class JwtExampleApplication {

    public static void main(String[] args) {
        SpringApplication.run(JwtExampleApplication.class, args);
    }


}
