package com.ratipatil.corejava.conditionalstatements;

/*
 * ConditionalStatementsExample.java
 * ----------------------------------------------------
 * This program demonstrates:
 * 1. if statement
 * 2. if-else statement
 * 3. if-else-if ladder
 * 4. nested if statement
 * 5. switch statement
 */

public class ConditionalStatementsExample {

    public static void main(String[] args) {

        // =================================================
        // 1. IF STATEMENT
        // Used to execute code when condition is true.
        // =================================================

        System.out.println("===== IF STATEMENT =====");

        int age = 20;

        if (age >= 18) {

            System.out.println("You are eligible to vote.");
        }


        // =================================================
        // 2. IF-ELSE STATEMENT
        // Executes one block if condition is true
        // otherwise executes else block.
        // =================================================

        System.out.println("\n===== IF-ELSE STATEMENT =====");

        int number = 7;

        if (number % 2 == 0) {

            System.out.println("Even Number");

        } else {

            System.out.println("Odd Number");
        }


        // =================================================
        // 3. IF-ELSE-IF LADDER
        // Used to check multiple conditions.
        // =================================================

        System.out.println("\n===== IF-ELSE-IF LADDER =====");

        int marks = 75;

        if (marks >= 90) {

            System.out.println("Grade A");

        } else if (marks >= 70) {

            System.out.println("Grade B");

        } else if (marks >= 50) {

            System.out.println("Grade C");

        } else {

            System.out.println("Fail");
        }


        // =================================================
        // 4. NESTED IF STATEMENT
        // if statement inside another if statement.
        // =================================================

        System.out.println("\n===== NESTED IF STATEMENT =====");

        int userAge = 22;
        boolean hasLicense = true;

        if (userAge >= 18) {

            if (hasLicense) {

                System.out.println("You can drive.");

            } else {

                System.out.println("License is required.");
            }

        } else {

            System.out.println("You are under age.");
        }


        // =================================================
        // 5. SWITCH STATEMENT
        // Used to select one option from multiple cases.
        // =================================================

        System.out.println("\n===== SWITCH STATEMENT =====");

        int day = 3;

        switch (day) {

            case 1:
                System.out.println("Monday");
                break;

            case 2:
                System.out.println("Tuesday");
                break;

            case 3:
                System.out.println("Wednesday");
                break;

            case 4:
                System.out.println("Thursday");
                break;

            default:
                System.out.println("Invalid Day");
        }


        // =================================================
        // PROGRAM FINISHED
        // =================================================

        System.out.println("\n===== PROGRAM FINISHED =====");
    }
}