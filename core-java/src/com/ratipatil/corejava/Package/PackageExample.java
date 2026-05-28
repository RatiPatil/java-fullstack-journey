package com.ratipatil.corejava.Package;

/*
 * PackageExample.java
 * ------------------------------------------------
 * This program demonstrates:
 * 1. Package creation
 * 2. Class inside package
 * 3. Running packaged program
 */

public class PackageExample {

    // =================================================
    // Method
    // =================================================

    void displayMessage() {

        System.out.println("Welcome to Java Packages");
    }


    // =================================================
    // Main Method
    // =================================================

    public static void main(String[] args) {

        // Creating object
        PackageExample obj = new PackageExample();

        // Calling method
        obj.displayMessage();
    }
}