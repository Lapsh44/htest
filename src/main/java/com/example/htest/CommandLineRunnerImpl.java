package com.example.htest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
class CommandLineRunnerImpl implements CommandLineRunner {
    @Autowired
    RestGetService restGetService;
    @Override
    public void run(String... args) throws Exception {
        System.out.println("In CommandLineRunnerImpl ");

        restGetService.chk();
        restGetService.chk2();

        for (String arg : args) {
            System.out.println(arg);
        }
    }
}