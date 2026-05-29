package com.ratipatil.corejava.oops.abstractclass;

/*
 * AbstractExample.java
 * ------------------------------------------------
 * This program demonstrates:
 * 1. Abstract class
 * 2. Abstract method
 * 3. Method overriding
 */

// =================================================
// Abstract Class
// =================================================

abstract class Animal {

    // Normal method
    void eat() {

        System.out.println("Animal is eating");
    }

    // Abstract method (no body)
    abstract void sound();
}


// =================================================
// Child Class
// =================================================

class Dog extends Animal {

    // Implementing abstract method
    void sound() {

        System.out.println("Dog barks");
    }
}


// =================================================
// Main Class
// =================================================

public class AbstractExample {

    public static void main(String[] args) {

        // Parent reference + child object
        Animal obj = new Dog();

        obj.eat();    // normal method

        obj.sound();  // implemented method
    }
}