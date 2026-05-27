package com.ratipatil.corejava.loops;

/*
 * LoopsExample.java
 * ----------------------------------------------------
 * This program demonstrates:
 * 1. for loop
 * 2. while loop
 * 3. do-while loop
 * 4. nested loop
 * 5. for-each loop
 * 6. break statement
 * 7. continue statement
 */

public class LoopsExample {

    public static void main(String[] args) {

        // =================================================
        // 1. FOR LOOP
        // Used when number of iterations is known.
        // =================================================

        System.out.println("===== FOR LOOP =====");

        for (int i = 1; i <= 5; i++) {

            System.out.println("Value of i: " + i);
        }


        // =================================================
        // 2. WHILE LOOP
        // Executes while condition is true.
        // =================================================

        System.out.println("\n===== WHILE LOOP =====");

        int number = 1;

        while (number <= 5) {

            System.out.println("Number: " + number);

            number++;
        }


        // =================================================
        // 3. DO-WHILE LOOP
        // Executes at least one time.
        // =================================================

        System.out.println("\n===== DO-WHILE LOOP =====");

        int value = 1;

        do {

            System.out.println("Value: " + value);

            value++;

        } while (value <= 5);


        // =================================================
        // 4. NESTED LOOP
        // Loop inside another loop.
        // =================================================

        System.out.println("\n===== NESTED LOOP =====");

        for (int i = 1; i <= 3; i++) {

            for (int j = 1; j <= 2; j++) {

                System.out.println("i = " + i + ", j = " + j);
            }
        }


        // =================================================
        // 5. FOR-EACH LOOP
        // Used to traverse arrays.
        // =================================================

        System.out.println("\n===== FOR-EACH LOOP =====");

        int[] numbers = {10, 20, 30, 40};

        for (int item : numbers) {

            System.out.println(item);
        }


        // =================================================
        // 6. BREAK STATEMENT
        // Stops loop execution.
        // =================================================

        System.out.println("\n===== BREAK STATEMENT =====");

        for (int i = 1; i <= 5; i++) {

            if (i == 3) {

                break;
            }

            System.out.println(i);
        }


        // =================================================
        // 7. CONTINUE STATEMENT
        // Skips current iteration.
        // =================================================

        System.out.println("\n===== CONTINUE STATEMENT =====");

        for (int i = 1; i <= 5; i++) {

            if (i == 3) {

                continue;
            }

            System.out.println(i);
        }


        // =================================================
        // PROGRAM FINISHED
        // =================================================

        System.out.println("\n===== PROGRAM FINISHED =====");
    }
}