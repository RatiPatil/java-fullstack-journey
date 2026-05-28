package com.ratipatil.corejava.oops.methodoverriding;

/*
 * MethodOverridingExample.java
 * ------------------------------------------------
 * This program demonstrates:
 * 1. Method Overriding
 * 2. Parent class method
 * 3. Child class method
 */

// =================================================
// Parent Class
// =================================================

class Animal {

    void sound() {

        System.out.println("Animal makes sound");
    }
}


// =================================================
// Child Class
// =================================================

class Dog extends Animal {

    // =================================================
    // Overriding Parent Method
    // Same method name and same parameters.
    // =================================================

    @Override
    void sound() {

        System.out.println("Dog barks");
    }
}


// =================================================
// Main Class
// =================================================

public class MethodOverridingExample {

    public static void main(String[] args) {

        // Creating child class object
        Dog dog1 = new Dog();

        // Calling overridden method
        dog1.sound();
    }
}