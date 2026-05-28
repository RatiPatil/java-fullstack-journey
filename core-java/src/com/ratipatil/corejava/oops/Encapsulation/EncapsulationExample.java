package com.ratipatil.corejava.oops.encapsulation;

/*
 * EncapsulationExample.java
 * ------------------------------------------------
 * This program demonstrates:
 * 1. Encapsulation
 * 2. Private variables
 * 3. Getter methods
 * 4. Setter methods
 */

class Student {

    // =================================================
    // Private Variables
    // Data hiding using private keyword.
    // =================================================

    private String name;
    private int age;


    // =================================================
    // Setter Method
    // Used to set values.
    // =================================================

    public void setName(String studentName) {

        name = studentName;
    }

    public void setAge(int studentAge) {

        age = studentAge;
    }


    // =================================================
    // Getter Method
    // Used to get values.
    // =================================================

    public String getName() {

        return name;
    }

    public int getAge() {

        return age;
    }
}


public class EncapsulationExample {

    public static void main(String[] args) {

        // Creating object
        Student student1 = new Student();


        // Setting values using setter methods
        student1.setName("Ratikant");

        student1.setAge(21);


        // Getting values using getter methods
        System.out.println("Student Name : "
                + student1.getName());

        System.out.println("Student Age : "
                + student1.getAge());
    }
}