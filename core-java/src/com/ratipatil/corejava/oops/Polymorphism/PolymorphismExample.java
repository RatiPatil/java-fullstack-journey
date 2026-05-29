package com.ratipatil.corejava.oops.polymorphism;

/*
 * Polymorphism Example in Java
 * ------------------------------------------------
 * This program demonstrates:
 * 1. Method Overloading (Compile-time Polymorphism)
 * 2. Method Overriding (Runtime Polymorphism)
 */

// =================================================
// Method Overloading Example (Compile-time Polymorphism)
// =================================================

class Calculator {

    void add(int a, int b) {

        System.out.println("Sum (2 numbers): " + (a + b));
    }

    void add(int a, int b, int c) {

        System.out.println("Sum (3 numbers): " + (a + b + c));
    }
}


// =================================================
// Method Overriding Example (Runtime Polymorphism)
// =================================================

class Animal {

    void sound() {

        System.out.println("Animal makes sound");
    }
}

class Dog extends Animal {

    @Override
    void sound() {

        System.out.println("Dog barks");
    }
}


// =================================================
// Main Class
// =================================================

public class PolymorphismExample {

    public static void main(String[] args) {

        // -----------------------------
        // Compile-time Polymorphism
        // -----------------------------

        Calculator calc = new Calculator();

        calc.add(10, 20);

        calc.add(10, 20, 30);


        System.out.println();


        // -----------------------------
        // Runtime Polymorphism
        // -----------------------------

        Animal obj = new Dog(); // Upcasting

        obj.sound(); // Dog method will run
    }
}