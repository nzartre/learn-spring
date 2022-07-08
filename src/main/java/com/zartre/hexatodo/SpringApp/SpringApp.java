package com.zartre.hexatodo.SpringApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringApp {
    public static void main(String[] args) {
        System.out.println("Starting server");

        SpringApplication.run(SpringApp.class, args);
    }
}