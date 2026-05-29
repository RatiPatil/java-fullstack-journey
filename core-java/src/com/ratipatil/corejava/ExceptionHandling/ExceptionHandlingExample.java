package com.ratipatil.corejava.ExceptionHandling;

/*
 * ExceptionHandlingExample.java
 * ------------------------------------------------
 * This program demonstrates:
 * 1. try block
 * 2. catch block
 * 3. Exception handling
 */

public class ExceptionHandlingExample {

    public static void main(String[] args) {

        // =================================================
        // Variables
        // =================================================

        int a = 10;
        int b = 0;


        // =================================================
        // try block
        // Risky code
        // =================================================

        try {

            int result = a / b;

            System.out.println(result);
        }


        // =================================================
        // catch block
        // Handles exception
        // =================================================

        catch (ArithmeticException e) {

            System.out.println("Cannot divide by zero");
        }


        // =================================================
        // Program continues
        // =================================================

        System.out.println("Program Finished");
    }
}