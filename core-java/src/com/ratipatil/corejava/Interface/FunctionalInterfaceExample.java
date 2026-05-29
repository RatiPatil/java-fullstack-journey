package com.ratipatil.corejava.Interface;

/*
 * Functional Interface Example
 */

@FunctionalInterface
interface Demo {

    void show();
}

public class FunctionalInterfaceExample {

    public static void main(String[] args) {

        Demo d = () -> {

            System.out.println("SAM Interface");
        };

        d.show();
    }
}