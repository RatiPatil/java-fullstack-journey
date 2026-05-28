package com.ratipatil.corejava.oops.Constructor;

/*
 * ConstructorExample.java
 * ------------------------------------------------
 * This program demonstrates:
 * 1. Constructor
 * 2. Default Constructor
 * 3. Parameterized Constructor
 */

class Student {

    // =================================================
    // Instance Variables
    // =================================================

    String name;
    int age;


    // =================================================
    // Default Constructor
    // Constructor without parameters.
    // =================================================

    Student() {

        name = "Ratikant";
        age = 21;

        System.out.println("Default Constructor Called");
    }


    // =================================================
    // Parameterized Constructor
    // Constructor with parameters.
    // =================================================

    Student(String studentName, int studentAge) {

        name = studentName;
        age = studentAge;

        System.out.println("Parameterized Constructor Called");
    }


    // =================================================
    // Method to display data
    // =================================================

    void displayStudentDetails() {

        System.out.println("Student Name : " + name);

        System.out.println("Student Age : " + age);
    }
}


public class ConstructorExample {

    public static void main(String[] args) {

        // =================================================
        // Calling Default Constructor
        // =================================================

        Student student1 = new Student();

        student1.displayStudentDetails();


        // =================================================
        // Calling Parameterized Constructor
        // =================================================

        Student student2 =
                new Student("Rahul", 22);

        student2.displayStudentDetails();
    }
}
