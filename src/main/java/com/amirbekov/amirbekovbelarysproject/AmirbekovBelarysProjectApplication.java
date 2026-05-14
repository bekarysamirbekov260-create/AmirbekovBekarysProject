package com.amirbekov.amirbekovbelarysproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

@EnableAsync
@SpringBootApplication
public class AmirbekovBelarysProjectApplication {

    public static void main(String[] args) {
        SpringApplication.run(AmirbekovBelarysProjectApplication.class, args);
    }

}
