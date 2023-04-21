package com.example.restapiweb;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestApiController {

    @Autowired
    //@Qualifier("oldemp")
    Employee emp;

    @Autowired
    private Environment env;

    @GetMapping("/Hello")
    public String Hello() {

        System.out.println(emp.getEmpname());
        System.out.println("Message from Application context " + emp.getMsg());
        System.out.println("Current active profile " + env.getActiveProfiles());
        System.out.println("Name " + emp.getName());
        System.out.println("Number " + emp.getNumber());
        return "Hello world";
    }
}
