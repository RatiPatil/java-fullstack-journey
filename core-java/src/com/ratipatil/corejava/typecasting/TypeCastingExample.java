package com.ratipatil.corejava.typecasting;

/*
 * TypeCastingExample.java
 * ---------------------------------------------------------
 * This program demonstrates:
 * 1. Type Conversion
 * 2. Type Casting
 * 3. Type Promotion
 *
 * Each concept includes:
 * - Definition
 * - Example
 * - Output
 */

public class TypeCastingExample {

    public static void main(String[] args) {

        // =====================================================
        // 1. TYPE CONVERSION (Implicit / Automatic Conversion)
        // =====================================================

        /*
         * Definition:
         * Type Conversion is the automatic conversion of a smaller
         * data type into a larger data type by the Java compiler.
         */

        byte byteValue = 100;

        // Automatically converted from byte to int
        int intValue = byteValue;

        System.out.println("========== TYPE CONVERSION ==========");
        System.out.println("Byte Value : " + byteValue);
        System.out.println("Converted Int Value : " + intValue);


        // =====================================================
        // 2. TYPE CASTING (Explicit Conversion)
        // =====================================================

        /*
         * Definition:
         * Type Casting is the manual conversion of a larger
         * data type into a smaller data type by the programmer.
         */

        double doubleValue = 99.99;

        // Manually converting double into int
        int convertedInt = (int) doubleValue;

        System.out.println("\n========== TYPE CASTING ==========");
        System.out.println("Double Value : " + doubleValue);
        System.out.println("Converted Int Value : " + convertedInt);


        // =====================================================
        // 3. TYPE PROMOTION
        // =====================================================

        /*
         * Definition:
         * Type Promotion occurs when smaller data types are
         * automatically promoted to int during expressions.
         */

        byte a = 10;
        byte b = 20;

        // byte + byte becomes int
        int result = a + b;

        System.out.println("\n========== TYPE PROMOTION ==========");
        System.out.println("Value of a : " + a);
        System.out.println("Value of b : " + b);
        System.out.println("Result after Promotion : " + result);


        // =====================================================
        // EXTRA EXAMPLE OF TYPE PROMOTION
        // =====================================================

        short x = 5;
        char y = 'A';

        // short and char promoted to int
        int finalResult = x + y;

        System.out.println("\n========== EXTRA TYPE PROMOTION ==========");
        System.out.println("Short Value : " + x);
        System.out.println("Char Value  : " + y);
        System.out.println("Final Result : " + finalResult);


        // =====================================================
        // PROGRAM END
        // =====================================================

        System.out.println("\n========== PROGRAM FINISHED ==========");
    }
}