package com.ratipatil.corejava.operators;

/*
 * OperatorsExample.java
 * ------------------------------------------------
 * This program demonstrates basic operators in Java
 * with simple and understandable examples.
 */

public class OperatorsExample {

    public static void main(String[] args) {

        int a = 10;
        int b = 5;

        // =================================================
        // 1. Arithmetic Operators
        // Used for mathematical calculations.
        // =================================================

        System.out.println("===== Arithmetic Operators =====");

        System.out.println("Addition (+): " + (a + b));

        System.out.println("Subtraction (-): " + (a - b));

        System.out.println("Multiplication (*): " + (a * b));

        System.out.println("Division (/): " + (a / b));

        System.out.println("Modulus (%): " + (a % b));


        // =================================================
        // 2. Assignment Operators
        // Used to assign values.
        // =================================================

        System.out.println("\n===== Assignment Operators =====");

        int number = 20;

        number += 10;
        System.out.println("After += : " + number);

        number -= 5;
        System.out.println("After -= : " + number);


        // =================================================
        // 3. Relational Operators
        // Used to compare values.
        // =================================================

        System.out.println("\n===== Relational Operators =====");

        System.out.println("a == b : " + (a == b));

        System.out.println("a != b : " + (a != b));

        System.out.println("a > b : " + (a > b));

        System.out.println("a < b : " + (a < b));


        // =================================================
        // 4. Logical Operators
        // Used with conditions.
        // =================================================

        System.out.println("\n===== Logical Operators =====");

        int age = 21;

        // Logical AND
        System.out.println("AND (&&): "
                + (age > 18 && age < 30));

        // Logical OR
        System.out.println("OR (||): "
                + (age < 18 || age > 20));

        // Logical NOT
        System.out.println("NOT (!): "
                + !(age > 18));


        // =================================================
        // 5. Unary Operators
        // Works with single value.
        // =================================================

        System.out.println("\n===== Unary Operators =====");

        int value = 10;

        value++;
        System.out.println("Increment (++): " + value);

        value--;
        System.out.println("Decrement (--): " + value);


        // =================================================
        // 6. Ternary Operator
        // Shortcut of if-else.
        // =================================================

        System.out.println("\n===== Ternary Operator =====");

        String result = (age >= 18)
                ? "Adult"
                : "Minor";

        System.out.println("Result: " + result);


        // =================================================
        // 7. Bitwise Operators
        // Used on binary numbers.
        // =================================================

        System.out.println("\n===== Bitwise Operators =====");

        int x = 5;
        int y = 3;

        System.out.println("Bitwise AND (&): " + (x & y));

        System.out.println("Bitwise OR (|): " + (x | y));


        // =================================================
        // 8. Shift Operators
        // Used to shift bits.
        // =================================================

        System.out.println("\n===== Shift Operators =====");

        int shift = 8;

        System.out.println("Left Shift (<<): "
                + (shift << 1));

        System.out.println("Right Shift (>>): "
                + (shift >> 1));


        // =================================================
        // End of Program
        // =================================================

        System.out.println("\n===== Program Finished =====");
    }
}