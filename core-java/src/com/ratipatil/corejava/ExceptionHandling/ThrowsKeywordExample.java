package com.ratipatil.corejava.ExceptionHandling;

import java.io.FileReader;

/*
 * ThrowsKeywordExample.java
 * ------------------------------------------------
 * This program demonstrates:
 * 1. throws keyword
 * 2. Delegating exception handling
 */

public class ThrowsKeywordExample {

    // =================================================
    // Method using throws keyword
    // =================================================

    static void readFile() throws Exception {

        // =================================================
        // FileReader may generate exception
        // =================================================

        FileReader file = new FileReader("demo.txt");

        System.out.println("File Opened Successfully");
    }


    // =================================================
    // Main Method
    // =================================================

    public static void main(String[] args) {

        try {

            // Calling method
            readFile();
        }

        // =================================================
        // Handling Exception
        // =================================================

        catch (Exception e) {

            System.out.println("Exception Handled");
        }
    }
}