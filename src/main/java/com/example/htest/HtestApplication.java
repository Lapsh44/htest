package com.example.htest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling
@SpringBootApplication
public class HtestApplication {

    public static void main(String[] args) {
        SpringApplication.run(HtestApplication.class, args);
    }

}
