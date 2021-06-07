package com.madd.backend;

import com.madd.backend.configurations.FileStorageProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties({FileStorageProperties.class})
public class MaddInitializer {
    public static void main(String[] args) {

        SpringApplication app = new SpringApplication(MaddInitializer.class);
        app.run(args);
    }
}

