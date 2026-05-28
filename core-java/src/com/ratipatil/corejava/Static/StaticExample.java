package com.ratipatil.corejava.Static;

/*
 * StaticExample.java
 * ------------------------------------------------
 * This program demonstrates:
 * 1. Static Variable
 * 2. Static Method
 * 3. Static Block
 */

class Student {

    // =================================================
    // Instance Variable
    // Separate copy for every object.
    // =================================================

    String studentName;


    // =================================================
    // Static Variable
    // Shared among all objects.
    // =================================================

    static String collegeName = "ABC College";


    // =================================================
    // Static Block
    // Executes only once when class loads.
    // =================================================

    static {

        System.out.println("Static Block Executed");
    }


    // =================================================
    // Constructor
    // =================================================

    Student(String name) {

        studentName = name;
    }


    // =================================================
    // Instance Method
    // =================================================

    void displayStudentDetails() {

        System.out.println("Student Name : "
                + studentName);

        System.out.println("College Name : "
                + collegeName);
    }


    // =================================================
    // Static Method
    // Can access only static members directly.
    // =================================================

    static void showCollegeInformation() {

        System.out.println("College : "
                + collegeName);
    }
}


public class StaticExample {

    public static void main(String[] args) {

        // =================================================
        // Creating Objects
        // =================================================

        Student student1 = new Student("Ratikant");

        Student student2 = new Student("Rahul");


        // =================================================
        // Calling Instance Method
        // =================================================

        student1.displayStudentDetails();

        System.out.println();

        student2.displayStudentDetails();


        // =================================================
        // Calling Static Method
        // Using class name
        // =================================================

        System.out.println();

        Student.showCollegeInformation();
    }
}