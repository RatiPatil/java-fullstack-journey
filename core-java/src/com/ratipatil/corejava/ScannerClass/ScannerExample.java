package com.ratipatil.corejava.ScannerClass;

import java.util.Scanner;

/*
 * ScannerExample.java
 * ------------------------------------------------
 * This program demonstrates:
 * 1. Scanner class
 * 2. User input
 * 3. Reading different values
 */

public class ScannerExample {

    public static void main(String[] args) {

        // =================================================
        // Creating Scanner Object
        // =================================================

        Scanner sc = new Scanner(System.in);


        // =================================================
        // Taking String Input
        // =================================================

        System.out.println("Enter Your Name:");

        String name = sc.nextLine();


        // =================================================
        // Taking Integer Input
        // =================================================

        System.out.println("Enter Your Age:");

        int age = sc.nextInt();


        // =================================================
        // Printing Output
        // =================================================

        System.out.println("Name: " + name);

        System.out.println("Age: " + age);


        // =================================================
        // Closing Scanner
        // =================================================

        sc.close();
    }
}