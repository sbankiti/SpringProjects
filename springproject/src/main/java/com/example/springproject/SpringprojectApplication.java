package com.example.springproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringprojectApplication {

    public static void main(String[] args) {

        ConfigurableApplicationContext context = SpringApplication.run(SpringprojectApplication.class, args);

        SpringTest sobj = context.getBean(SpringTest.class);

        System.out.println("Hello world");

        SpringTest sobj1 = context.getBean(SpringTest.class);

        sobj1.setName("Uma");
        System.out.println(sobj.getName());
    }

}
