package com.ratipatil.corejava.datatypes;

/*
 * DataTypesExample.java
 * -----------------------------------------
 * This program demonstrates:
 * 1. Primitive Data Types in Java
 * 2. Variable Declaration
 * 3. Printing Values
 * 4. Data Type Ranges
 */

public class DataTypesExample {

    public static void main(String[] args) {

        // byte data type
        byte byteValue = 100;

        // short data type
        short shortValue = 30000;

        // int data type
        int intValue = 200000;

        // long data type
        long longValue = 9876543210L;

        // float data type
        float floatValue = 85.5f;

        // double data type
        double doubleValue = 99.999;

        // char data type
        char grade = 'A';

        // boolean data type
        boolean isJavaEasy = true;

        // Printing values
        System.out.println("========== Java Data Types ==========\n");

        System.out.println("Byte Value     : " + byteValue);
        System.out.println("Short Value    : " + shortValue);
        System.out.println("Int Value      : " + intValue);
        System.out.println("Long Value     : " + longValue);
        System.out.println("Float Value    : " + floatValue);
        System.out.println("Double Value   : " + doubleValue);
        System.out.println("Character Grade: " + grade);
        System.out.println("Boolean Value  : " + isJavaEasy);

        System.out.println("\n========== Program Finished ==========");
    }
}