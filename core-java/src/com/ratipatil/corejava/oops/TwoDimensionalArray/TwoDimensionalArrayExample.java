package com.ratipatil.corejava.oops.TwoDimensionalArray;

/*
 * TwoDimensionalArrayExample.java
 * ------------------------------------------------
 * This program demonstrates:
 * 1. 2D Array
 * 2. Rows and Columns
 * 3. Traversing 2D Array
 */

public class TwoDimensionalArrayExample {

    public static void main(String[] args) {

        // =================================================
        // 2D Array
        // 2D array stores data in rows and columns.
        // =================================================

        int[][] numbers = {

                {10, 20, 30},
                {40, 50, 60},
                {70, 80, 90}
        };


        // =================================================
        // Accessing Elements
        // =================================================

        System.out.println("===== 2D ARRAY ELEMENTS =====");

        System.out.println("First Element : " + numbers[0][0]);

        System.out.println("Second Row Second Element : "
                + numbers[1][1]);


        // =================================================
        // Traversing 2D Array
        // =================================================

        System.out.println("\n===== ALL 2D ARRAY ELEMENTS =====");

        for (int i = 0; i < numbers.length; i++) {

            for (int j = 0; j < numbers[i].length; j++) {

                System.out.print(numbers[i][j] + " ");
            }

            System.out.println();
        }


        // =================================================
        // PROGRAM FINISHED
        // =================================================

        System.out.println("\n===== PROGRAM FINISHED =====");
    }
}