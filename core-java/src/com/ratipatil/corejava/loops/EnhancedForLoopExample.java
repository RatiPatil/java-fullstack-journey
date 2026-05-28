package com.ratipatil.corejava.loops;

/*
 * EnhancedForLoopExample.java
 * ------------------------------------------------
 * This program demonstrates:
 * Enhanced For Loop in Java
 */

public class EnhancedForLoopExample {

    public static void main(String[] args) {

        // =================================================
        // Array Creation
        // =================================================

        int[] numbers = {10, 20, 30, 40, 50};


        // =================================================
        // Enhanced For Loop
        // Used to traverse array easily.
        // =================================================

        System.out.println("===== ARRAY ELEMENTS =====");

        for (int number : numbers) {

            System.out.println(number);
        }


        // =================================================
        // PROGRAM FINISHED
        // =================================================

        System.out.println("\n===== PROGRAM FINISHED =====");
    }
}