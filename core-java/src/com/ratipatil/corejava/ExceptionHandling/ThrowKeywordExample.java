package com.ratipatil.corejava.ExceptionHandling;

/*
 * ThrowKeywordExample.java
 * ------------------------------------------------
 * This program demonstrates:
 * 1. throw keyword
 * 2. Manual exception throwing
 */

public class ThrowKeywordExample {

    public static void main(String[] args) {

        // =================================================
        // Age Variable
        // =================================================

        int age = 15;

        // =================================================
        // Condition Check
        // =================================================

        if (age < 18) {

            // Manually throwing exception
            throw new ArithmeticException("Not Eligible for Voting");
        }

        System.out.println("Eligible");
    }
}