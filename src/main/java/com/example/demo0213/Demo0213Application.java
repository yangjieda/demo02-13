package com.example.demo0213;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.example.demo0213.dao")
public class Demo0213Application {

    public static void main(String[] args) {
        SpringApplication.run(Demo0213Application.class, args);
    }

}

