package com.ratipatil.corejava.oops.methodOverloading;

/*
 * MethodOverloadingExample.java
 * ------------------------------------------------
 * This program demonstrates Method Overloading.
 *
 * Method Overloading:
 * Same method name with different parameters.
 */

public class MethodOverloadingExample {

    // =================================================
    // Method 1
    // No parameters
    // =================================================

    void display() {

        System.out.println("Display Method");
    }


    // =================================================
    // Method 2
    // One int parameter
    // =================================================

    void display(int number) {

        System.out.println("Number: " + number);
    }


    // =================================================
    // Method 3
    // Two int parameters
    // =================================================

    void display(int a, int b) {

        System.out.println("Addition: " + (a + b));
    }


    // =================================================
    // Main Method
    // =================================================

    public static void main(String[] args) {

        // Creating object
        MethodOverloadingExample obj =
                new MethodOverloadingExample();

        // Calling overloaded methods
        obj.display();

        obj.display(10);

        obj.display(10, 20);
    }
}