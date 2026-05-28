package com.ratipatil.corejava.ThisKeyword;

/*
 * ThisKeywordExample.java
 * ------------------------------------------------
 * This program demonstrates:
 * 1. this keyword
 * 2. Instance variables
 * 3. Constructor usage
 */

class Student {

    // =================================================
    // Instance Variables
    // =================================================

    String name;
    int age;


    // =================================================
    // Constructor
    // 'this' keyword refers to current object.
    // =================================================

    Student(String name, int age) {

        this.name = name;
        this.age = age;
    }


    // =================================================
    // Method
    // =================================================

    void displayStudentDetails() {

        System.out.println("Student Name : " + name);

        System.out.println("Student Age : " + age);
    }
}


public class ThisKeywordExample {

    public static void main(String[] args) {

        // Creating object
        Student student1 =
                new Student("Ratikant", 21);

        // Calling method
        student1.displayStudentDetails();
    }
}