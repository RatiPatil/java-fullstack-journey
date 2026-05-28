package com.ratipatil.corejava.array;

/*
 * ArrayExample.java
 * ------------------------------------------------
 * This program demonstrates:
 * 1. Simple Array
 * 2. Accessing Array Elements
 * 3. Traversing Array using loop
 */

public class ArrayExample {

    public static void main(String[] args) {

        // =================================================
        // Simple Array
        // Array stores multiple values of same data type.
        // =================================================

        int[] numbers = {10, 20, 30, 40, 50};

        // =================================================
        // Accessing Array Elements
        // =================================================

        System.out.println("===== ARRAY ELEMENTS =====");

        System.out.println("First Element : " + numbers[0]);

        System.out.println("Second Element : " + numbers[1]);

        System.out.println("Third Element : " + numbers[2]);


        // =================================================
        // Traversing Array using for loop
        // =================================================

        System.out.println("\n===== ALL ARRAY ELEMENTS =====");

        for (int i = 0; i < numbers.length; i++) {

            System.out.println(numbers[i]);
        }


        // =================================================
        // PROGRAM FINISHED
        // =================================================

        System.out.println("\n===== PROGRAM FINISHED =====");
    }
}