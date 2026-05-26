package com.ratipatil.corejava.variables;

/*
 * VariablesExample.java
 * ------------------------------------------------
 * This program demonstrates:
 * 1. Different data types in Java
 * 2. Basic operations on variables
 * 3. Printing formatted output
 * 4. Type casting and calculations
 */

public class VariablesExample {

    public static void main(String[] args) {

        // ================================
        // String Data Type
        // ================================
        String name = "Ratikant Patil";

        // ================================
        // Integer Data Type
        // ================================
        int age = 21;

        // ================================
        // Float Data Type
        // ================================
        float percentage = 89.5f;

        // ================================
        // Double Data Type
        // ================================
        double englishMarks = 90.35;

        // ================================
        // Character Data Type
        // ================================
        char grade = 'A';

        // ================================
        // Boolean Data Type
        // ================================
        boolean isPlaced = false;

        // ================================
        // Long Data Type
        // ================================
        long population = 1400000000L;

        // ================================
        // Short Data Type
        // ================================
        short year = 2026;

        // ================================
        // Byte Data Type
        // ================================
        byte number = 100;

        // ================================
        // Arithmetic Operations
        // ================================

        int num1 = 50;
        int num2 = 20;

        int addition = num1 + num2;
        int subtraction = num1 - num2;
        int multiplication = num1 * num2;
        int division = num1 / num2;
        int modulus = num1 % num2;

        // ================================
        // Increment and Decrement
        // ================================
        age++;
        number--;

        // ================================
        // Type Casting
        // ================================
        double salary = 50000.75;

        // Explicit type casting
        int salaryInInteger = (int) salary;

        // ================================
        // Final Output
        // ================================

        System.out.println("========== Java Variables Example ==========\n");

        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Percentage: " + percentage);
        System.out.println("English Marks: " + englishMarks);
        System.out.println("Grade: " + grade);
        System.out.println("Placement Status: " + isPlaced);
        System.out.println("Population: " + population);
        System.out.println("Current Year: " + year);
        System.out.println("Byte Number: " + number);

        System.out.println("\n========== Arithmetic Operations ==========");

        System.out.println("Addition: " + addition);
        System.out.println("Subtraction: " + subtraction);
        System.out.println("Multiplication: " + multiplication);
        System.out.println("Division: " + division);
        System.out.println("Modulus: " + modulus);

        System.out.println("\n========== Type Casting ==========");

        System.out.println("Original Salary (double): " + salary);
        System.out.println("Salary after Type Casting (int): " + salaryInInteger);

        System.out.println("\n========== Program Finished ==========");
    }
}