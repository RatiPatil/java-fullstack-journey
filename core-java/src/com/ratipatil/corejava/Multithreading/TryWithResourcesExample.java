package com.ratipatil.corejava.Multithreading;

import java.io.BufferedReader;
import java.io.FileReader;

/*
 * TryWithResourcesExample.java
 * ------------------------------------------------
 * This program demonstrates:
 * 1. try-with-resources
 * 2. Automatic resource closing
 * 3. Reading data from file
 */

public class TryWithResourcesExample {

    public static void main(String[] args) {

        /*
         * Resource created inside try()
         * Java automatically closes it.
         */

        try (BufferedReader br =
                     new BufferedReader(
                             new FileReader("demo.txt"))) {

            // Reading first line from file
            String data = br.readLine();

            System.out.println("File Data: " + data);
        }

        catch (Exception e) {

            System.out.println("Exception: " + e.getMessage());
        }
    }
}