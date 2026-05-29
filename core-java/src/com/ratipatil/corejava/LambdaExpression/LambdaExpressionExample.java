package com.ratipatil.corejava.LambdaExpression;

/*
 * LambdaExpressionExample.java
 * ------------------------------------------------
 * This program demonstrates:
 * 1. Functional Interface
 * 2. Lambda Expression
 * 3. SAM Interface
 */

// =================================================
// Functional Interface
// SAM = Single Abstract Method
// =================================================

@FunctionalInterface
interface Message {

    void showMessage();
}


// =================================================
// Main Class
// =================================================

public class LambdaExpressionExample {

    public static void main(String[] args) {

        // =================================================
        // Lambda Expression
        // Short way to implement interface method
        // =================================================

        Message msg = () -> {

            System.out.println("Lambda Expression in Java");
        };


        // =================================================
        // Calling Method
        // =================================================

        msg.showMessage();
    }
}