package com.example.restapiweb;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface FunctInterface{

    static boolean printMeth(){
        System.out.println("Inside the interface");
        return false;
    }
}
