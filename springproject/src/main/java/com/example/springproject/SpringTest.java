package com.example.springproject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(value = "prototype")
public class SpringTest {

    String name;

    @Autowired
    @Qualifier("AnotherClass")
    private AnotherClass anthobj;

    public SpringTest(){
        System.out.println("Object created");
    }

    public String getName() {
        anthobj.show();
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public AnotherClass getobj(){

        return anthobj;
    }

    public AnotherClass setobj(AnotherClass anthobj){

        this.anthobj = anthobj;
        return anthobj;
    }
}
