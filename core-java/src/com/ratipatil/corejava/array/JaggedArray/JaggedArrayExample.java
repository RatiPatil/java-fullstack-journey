package com.ratipatil.corejava.array.JaggedArray;

/*
 * JaggedArrayExample.java
 * ------------------------------------------------
 * This program demonstrates:
 * 1. Jagged Array
 * 2. Different column sizes
 * 3. Traversing Jagged Array
 */

public class JaggedArrayExample {

    public static void main(String[] args) {

        // =================================================
        // Jagged Array
        // Rows can have different number of columns.
        // =================================================

        int[][] numbers = {

                {10, 20, 30},
                {40, 50},
                {60, 70, 80, 90}
        };


        // =================================================
        // Displaying Jagged Array Elements
        // =================================================

        System.out.println("===== JAGGED ARRAY ELEMENTS =====");

        for (int i = 0; i < numbers.length; i++) {

            for (int j = 0; j < numbers[i].length; j++) {

                System.out.print(numbers[i][j] + " ");
            }

            System.out.println();
        }


        // =================================================
        // Accessing Specific Elements
        // =================================================

        System.out.println("\n===== ACCESSING ELEMENTS =====");

        System.out.println("First Row First Element : "
                + numbers[0][0]);

        System.out.println("Second Row Second Element : "
                + numbers[1][1]);

        System.out.println("Third Row Fourth Element : "
                + numbers[2][3]);


        // =================================================
        // PROGRAM FINISHED
        // =================================================

        System.out.println("\n===== PROGRAM FINISHED =====");
    }
}