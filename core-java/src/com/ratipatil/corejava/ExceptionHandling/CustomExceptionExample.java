package com.ratipatil.corejava.ExceptionHandling;

/*
 * CustomExceptionExample.java
 * ------------------------------------------------
 * This program demonstrates:
 * 1. Custom Exception
 * 2. User-defined exception
 */

// =================================================
// Custom Exception Class
// =================================================

class InvalidAgeException extends Exception {

    // Constructor
    InvalidAgeException(String message) {

        super(message);
    }
}


// =================================================
// Main Class
// =================================================

public class CustomExceptionExample {

    public static void main(String[] args) {

        // =================================================
        // Age Variable
        // =================================================

        int age = 15;

        try {

            // =================================================
            // Condition Check
            // =================================================

            if(age < 18) {

                // Throwing custom exception
                throw new InvalidAgeException(
                        "You are not eligible for voting");
            }

            System.out.println("Eligible for voting");
        }

        // =================================================
        // Catch Block
        // =================================================

        catch (InvalidAgeException e) {

            System.out.println(e.getMessage());
        }
    }
}