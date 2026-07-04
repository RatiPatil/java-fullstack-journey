package com.ratipatil.corejava.oops.Inheritance;

/*
 * SingleInheritanceExample.java
 * ------------------------------------------------
 * This program demonstrates:
 * Single Inheritance
 */




// =================================================
// Main Class
// =================================================

public class SingleInheritanceExample {

    public static void main(String[] args) {

        // Creating object of child class
        Dog dog1 = new Dog();

        // Accessing parent class method
        dog1.eat();

        // Accessing child class method
        dog1.bark();
    }
}