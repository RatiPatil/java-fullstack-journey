package com.ratipatil.corejava.oops.ClassObject;

/*
 * ClassAndObjectExample.java
 * ------------------------------------------------
 * This program demonstrates:
 * 1. Class
 * 2. Object
 * 3. Instance variables
 * 4. Methods
 */

public class ClassAndObjectExample {

    // =================================================
    // Instance Variables
    // Variables declared inside class but outside method.
    // =================================================

    String studentName = "Ratikant";
    int studentAge = 21;
    double studentMarks = 85.5;


    // =================================================
    // Method
    // Used to display student details.
    // =================================================

    void displayStudentDetails() {

        System.out.println("Student Name  : " + studentName);
        System.out.println("Student Age   : " + studentAge);
        System.out.println("Student Marks : " + studentMarks);
    }


    // =================================================
    // Main Method
    // Program execution starts from here.
    // =================================================

    public static void main(String[] args) {

        // =================================================
        // Object Creation
        // Object is created using 'new' keyword.
        // =================================================

        ClassAndObjectExample student1 =
                new ClassAndObjectExample();

        // =================================================
        // Calling Method using Object
        // =================================================

        student1.displayStudentDetails();
    }
}