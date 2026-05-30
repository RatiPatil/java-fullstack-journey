package com.ratipatil.corejava.TypeInference;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
 * ==========================================================
 * TypeInferenceExample.java
 * ==========================================================
 * Type Inference (var) was introduced in Java 10.
 *
 * The compiler automatically determines the variable type
 * based on the assigned value.
 *
 * Note:
 * var can only be used for local variables.
 * ==========================================================
 */

public class TypeInferenceExample {

    public static void main(String[] args) {

        /*
         * Traditional Variable Declaration
         */
        String name = "Ratikant";
        int age = 21;

        System.out.println("Traditional Variables:");
        System.out.println(name);
        System.out.println(age);

        /*
         * Type Inference using var
         * Compiler automatically detects the type.
         */
        var city = "Pune";      // String
        var salary = 50000;     // int
        var percentage = 85.50; // double
        var isActive = true;    // boolean

        System.out.println("\nUsing var:");

        System.out.println(city);
        System.out.println(salary);
        System.out.println(percentage);
        System.out.println(isActive);

        /*
         * Using var with List
         */
        var fruits = new ArrayList<String>();

        fruits.add("Apple");
        fruits.add("Mango");
        fruits.add("Banana");

        System.out.println("\nList Example:");
        System.out.println(fruits);

        /*
         * Using var with Map
         */
        var studentMap = new HashMap<Integer, String>();

        studentMap.put(101, "Amit");
        studentMap.put(102, "Rahul");
        studentMap.put(103, "Neha");

        System.out.println("\nMap Example:");
        System.out.println(studentMap);

        /*
         * Using var in for-each loop
         */
        System.out.println("\nFor-Each Loop:");

        for (var fruit : fruits) {
            System.out.println(fruit);
        }

        /*
         * Important Limitation
         * var requires initialization.
         */

        // var data;  // Compilation Error

        /*
         * Compiler determines actual type.
         */
        var message = "Hello Java";

        System.out.println("\nMessage:");
        System.out.println(message);
    }
}