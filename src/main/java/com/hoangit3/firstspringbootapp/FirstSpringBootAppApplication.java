package com.hoangit3.firstspringbootapp;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
@PropertySource(value = "classpath:config.properties")
public class FirstSpringBootAppApplication {

    @Value("${my-name}")
    private String myName;
    @Value("${my-app}")
    private String myApp;

    public static void main(String[] args) {
        SpringApplication.run(FirstSpringBootAppApplication.class, args);
    }

    @Bean
    CommandLineRunner commandLineRunner() {
        return args -> {
            System.out.println("Hello " + myName);
            System.out.println("Hello " + myApp);
        };
    }

}
