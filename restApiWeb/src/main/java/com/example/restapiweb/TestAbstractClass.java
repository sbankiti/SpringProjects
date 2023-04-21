package com.example.restapiweb;

import com.fasterxml.jackson.databind.ser.std.StdKeySerializers;

public class TestAbstractClass implements FunctInterface {

    //public abstract void testMeth();

    static boolean printMeth() throws IllegalAccessError, IllegalAccessException{
        System.out.println("Inside the interface");
        return false;

    }

}
