package com.ratipatil.corejava.literals;

/*
 * LiteralsExample.java
 * ------------------------------------------------
 * This program demonstrates different types of
 * literals in Java.
 *
 * Types of Literals:
 * 1. Integer Literal
 * 2. Floating-Point Literal
 * 3. Character Literal
 * 4. String Literal
 * 5. Boolean Literal
 * 6. Null Literal
 * 7. Binary Literal
 * 8. Octal Literal
 * 9. Hexadecimal Literal
 */

public class LiteralsExample {

    public static void main(String[] args) {

        // =========================================
        // Integer Literal
        // =========================================
        int number = 100;

        // =========================================
        // Floating-Point Literal
        // =========================================
        float percentage = 85.5f;
        double salary = 50000.75;

        // =========================================
        // Character Literal
        // =========================================
        char grade = 'A';

        // =========================================
        // String Literal
        // =========================================
        String name = "Ratikant Patil";

        // =========================================
        // Boolean Literal
        // =========================================
        boolean isJavaEasy = true;

        // =========================================
        // Null Literal
        // =========================================
        String collegeName = null;

        // =========================================
        // Binary Literal
        // Prefix: 0b
        // Binary 1010 = Decimal 10
        // =========================================
        int binaryValue = 0b1010;

        // =========================================
        // Octal Literal
        // Prefix: 0
        // Octal 12 = Decimal 10
        // =========================================
        int octalValue = 012;

        // =========================================
        // Hexadecimal Literal
        // Prefix: 0x
        // Hexadecimal A = Decimal 10
        // =========================================
        int hexValue = 0xA;

        // =========================================
        // Printing All Values
        // =========================================

        System.out.println("========== Java Literals Example ==========\n");

        System.out.println("Integer Literal      : " + number);
        System.out.println("Float Literal        : " + percentage);
        System.out.println("Double Literal       : " + salary);
        System.out.println("Character Literal    : " + grade);
        System.out.println("String Literal       : " + name);
        System.out.println("Boolean Literal      : " + isJavaEasy);
        System.out.println("Null Literal         : " + collegeName);

        System.out.println("\n========== Number Literals ==========");

        System.out.println("Binary Literal       : " + binaryValue);
        System.out.println("Octal Literal        : " + octalValue);
        System.out.println("Hexadecimal Literal  : " + hexValue);

        System.out.println("\n========== Program Finished ==========");
    }
}