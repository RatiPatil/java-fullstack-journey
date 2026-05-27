package com.ratipatil.corejava.memorymanagement;

/*
 * StackAndHeapMemoryExample.java
 * ------------------------------------------------
 * This program demonstrates:
 * 1. Stack Memory
 * 2. Heap Memory
 * 3. Object Creation
 * 4. Local Variables
 */

class Student {

    // =================================================
    // Instance Variables
    // Stored inside Heap Memory with object.
    // =================================================

    String name = "Ratikant";
    int age = 21;
}

public class StackAndHeapMemoryExample {

    public static void main(String[] args) {

        // =================================================
        // Local Variable
        // Stored inside Stack Memory.
        // =================================================

        int marks = 90;

        // =================================================
        // Object Reference Variable
        // 'student1' reference stored in Stack Memory.
        // =================================================

        // =================================================
        // Object
        // Actual object stored in Heap Memory.
        // =================================================

        Student student1 = new Student();


        // =================================================
        // Displaying Values
        // =================================================

        System.out.println("Marks : " + marks);

        System.out.println("Student Name : "
                + student1.name);

        System.out.println("Student Age : "
                + student1.age);


        // =================================================
        // Memory Understanding
        // =================================================

        /*
         * STACK MEMORY
         * -----------------
         * marks = 90
         * student1 (reference)
         *
         * HEAP MEMORY
         * -----------------
         * Student Object
         * name = "Ratikant"
         * age = 21
         */
    }
}