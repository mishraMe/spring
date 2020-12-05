package com.madd.backend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MaddInitializer {
    public static void main(String[] args) {

        SpringApplication app = new SpringApplication(MaddInitializer.class);
        app.run(args);
    }
}

