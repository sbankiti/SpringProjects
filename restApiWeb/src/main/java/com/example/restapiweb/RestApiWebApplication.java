package com.example.restapiweb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RestApiWebApplication {

    public static void main(String[] args) {
        SpringApplication.run(RestApiWebApplication.class, args);

        TestAbstractClass test = new TestAbstractClass();


    }

}
