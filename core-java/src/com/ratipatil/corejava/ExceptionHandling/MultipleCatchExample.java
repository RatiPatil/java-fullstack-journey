package com.ratipatil.corejava.ExceptionHandling;

/*
 * MultipleCatchExample.java
 * ------------------------------------------------
 * This program demonstrates:
 * 1. Multiple catch blocks
 * 2. Different exception handling
 */

public class MultipleCatchExample {

    public static void main(String[] args) {

        // =================================================
        // Array
        // =================================================

        int[] numbers = {10, 20, 30};

        try {

            // =================================================
            // Risky Code
            // =================================================

            int result = 10 / 0;

            System.out.println(numbers[5]);
        }

        // =================================================
        // Arithmetic Exception
        // =================================================

        catch (ArithmeticException e) {

            System.out.println("Cannot divide by zero");
        }

        // =================================================
        // Array Exception
        // =================================================

        catch (ArrayIndexOutOfBoundsException e) {

            System.out.println("Invalid Array Index");
        }

        // =================================================
        // General Exception
        // =================================================

        catch (Exception e) {

            System.out.println("General Exception");
        }

        System.out.println("Program Finished");
    }
}