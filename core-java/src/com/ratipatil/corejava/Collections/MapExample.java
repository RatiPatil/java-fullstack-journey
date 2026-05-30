package com.ratipatil.corejava.Collections;

import java.util.HashMap;
import java.util.Map;

/*
 * MapExample.java
 * ------------------------------------------------
 * This program demonstrates:
 * 1. Map Interface
 * 2. HashMap Class
 * 3. Key-Value Pairs
 * 4. Common Map Operations
 */

public class MapExample {

    public static void main(String[] args) {

        // =================================================
        // Creating HashMap
        // =================================================

        Map<Integer, String> students = new HashMap<>();


        // =================================================
        // Adding Key-Value Pairs
        // =================================================

        students.put(101, "Ratikant");
        students.put(102, "Rahul");
        students.put(103, "Amit");
        students.put(104, "Priya");


        // =================================================
        // Printing Map
        // =================================================

        System.out.println("Students Data:");

        System.out.println(students);


        // =================================================
        // Getting Value Using Key
        // =================================================

        System.out.println("\nStudent with ID 101:");

        System.out.println(students.get(101));


        // =================================================
        // Checking Key Exists
        // =================================================

        System.out.println("\nContains Key 102?");

        System.out.println(students.containsKey(102));


        // =================================================
        // Removing Element
        // =================================================

        students.remove(103);

        System.out.println("\nAfter Removing ID 103:");

        System.out.println(students);


        // =================================================
        // Total Elements
        // =================================================

        System.out.println("\nTotal Students:");

        System.out.println(students.size());


        // =================================================
        // Loop Through Map
        // =================================================

        System.out.println("\nStudent Records:");

        for (Map.Entry<Integer, String> entry : students.entrySet()) {

            System.out.println(
                    entry.getKey()
                            + " : "
                            + entry.getValue());
        }
    }
}