package com.ratipatil.corejava.JavaModernFeature.ConstructorReference;/*
 * ==========================================================
 * ConstructorReferenceExample.java
 * ==========================================================
 * Constructor Reference is used to create objects
 * using ::new syntax.
 * ==========================================================
 */

interface StudentFactory {
    Student create(String name);
}

class Student {

    Student(String name) {
        System.out.println("Student Created: " + name);
    }
}

public class ConstructorReferenceExample {

    public static void main(String[] args) {

        /*
         * Constructor Reference
         */
        StudentFactory factory = Student::new;

        factory.create("Ratikant");
    }
}