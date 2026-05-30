package com.ratipatil.corejava.Collections;

import java.util.ArrayList;

/*
 * ArrayListExample.java
 * ------------------------------------------------
 * This program demonstrates:
 * 1. ArrayList
 * 2. Add Elements
 * 3. Remove Elements
 * 4. Get Elements
 * 5. Enhanced For Loop
 */

public class ArrayListExample {

    public static void main(String[] args) {

        // =================================================
        // Creating ArrayList
        // =================================================

        ArrayList<String> students = new ArrayList<>();


        // =================================================
        // Adding Elements
        // =================================================

        students.add("Ratikant");
        students.add("Rahul");
        students.add("Amit");
        students.add("Priya");


        // =================================================
        // Printing ArrayList
        // =================================================

        System.out.println("Students List:");

        System.out.println(students);


        // =================================================
        // Getting Element
        // =================================================

        System.out.println("\nFirst Student:");

        System.out.println(students.get(0));


        // =================================================
        // Removing Element
        // =================================================

        students.remove("Rahul");

        System.out.println("\nAfter Removing Rahul:");

        System.out.println(students);


        // =================================================
        // ArrayList Size
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