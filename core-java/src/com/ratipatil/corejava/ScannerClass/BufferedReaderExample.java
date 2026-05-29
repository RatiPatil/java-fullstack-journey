package com.ratipatil.corejava.ScannerClass;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
 * BufferedReaderExample.java
 * ------------------------------------------------
 * This program demonstrates:
 * 1. BufferedReader class
 * 2. User input using readLine()
 */

public class BufferedReaderExample {

    public static void main(String[] args) throws Exception {

        // =================================================
        // Creating BufferedReader Object
        // =================================================

        BufferedReader br =
                new BufferedReader(
                        new InputStreamReader(System.in));


        // =================================================
        // Taking User Input
        // =================================================

        System.out.println("Enter Your Name:");

        String name = br.readLine();


        // =================================================
        // Printing Output
        // =================================================

        System.out.println("Hello " + name);
    }
}