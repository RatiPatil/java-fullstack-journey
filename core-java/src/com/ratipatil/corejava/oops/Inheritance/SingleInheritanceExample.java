package com.ratipatil.corejava.oops.Inheritance;

/*
 * SingleInheritanceExample.java
 * ------------------------------------------------
 * This program demonstrates:
 * Single Inheritance
 */

// =================================================
// Parent Class
// =================================================

class Animal {

    void eat() {

        System.out.println("Animal is Eating");
    }
}


// =================================================
// Child Class
// =================================================

class Dog extends Animal {

    void bark() {

        System.out.println("Dog is Barking");
    }
}


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