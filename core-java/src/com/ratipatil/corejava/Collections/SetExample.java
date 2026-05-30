package com.ratipatil.corejava.Collections;

import java.util.HashSet;
import java.util.Set;

/*
 * SetExample.java
 * ------------------------------------------------
 * This program demonstrates:
 * 1. Set Interface
 * 2. HashSet Class
 * 3. Unique Elements
 * 4. No Duplicate Values
 */

public class SetExample {

    public static void main(String[] args) {

        // =================================================
        // Creating Set
        // =================================================

        Set<String> students = new HashSet<>();


        // =================================================
        // Adding Elements
        // =================================================

        students.add("Ratikant");
        students.add("Rahul");
        students.add("Amit");
        students.add("Priya");

        // Duplicate Value
        students.add("Rahul");


        // =================================================
        // Printing Set
        // =================================================

        System.out.println("Students:");

        System.out.println(students);


        // =================================================
        // Checking Element
        // =================================================

        System.out.println("\nContains Rahul?");

        System.out.println(students.contains("Rahul"));


        // =================================================
        // Removing Element
        // =================================================

        students.remove("Amit");

        System.out.println("\nAfter Removing Amit:");

        System.out.println(students);


        // =================================================
        // Total Elements
        // =================================================

        System.out.println("\nTotal Students:");

        System.out.println(students.size());


        // =================================================
        // Enhanced For Loop
        // =================================================

        System.out.println("\nStudent Names:");

        for(String student : students) {

            System.out.println(student);
        }
    }
}