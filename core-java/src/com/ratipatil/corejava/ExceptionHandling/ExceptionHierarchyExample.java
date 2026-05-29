package com.ratipatil.corejava.ExceptionHandling;

/*
 * ExceptionHierarchyExample.java
 * ------------------------------------------------
 * This program demonstrates:
 * 1. Exception Hierarchy
 * 2. Parent and child exceptions
 */

public class ExceptionHierarchyExample {

    public static void main(String[] args) {

        try {

            int number = 10 / 0;
        }

        catch (ArithmeticException e) {

            System.out.println("Arithmetic Exception");
        }

        catch (RuntimeException e) {

            System.out.println("Runtime Exception");
        }

        catch (Exception e) {

            System.out.println("General Exception");
        }
    }
}