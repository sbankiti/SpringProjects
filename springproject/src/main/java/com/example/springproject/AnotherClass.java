package com.example.springproject;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("AnotherClass")
@Scope(value = "prototype")
public class AnotherClass {
    public AnotherClass(){
        System.out.println("Another");
    }

    public void show(){
        System.out.println("AnotherClass");
    }
}
