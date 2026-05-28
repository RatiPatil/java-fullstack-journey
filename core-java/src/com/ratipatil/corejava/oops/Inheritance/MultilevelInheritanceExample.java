package com.ratipatil.corejava.oops.Inheritance;

/*
 * MultilevelInheritanceExample.java
 * ------------------------------------------------
 * This program demonstrates:
 * Multilevel Inheritance
 */

// =================================================
// Grandparent Class
// =================================================

class Animal {

    void eat() {

        System.out.println("Animal is Eating");
    }
}


// =================================================
// Parent Class
// =================================================

class Dog extends Animal {

    void bark() {

        System.out.println("Dog is Barking");
    }
}


// =================================================
// Child Class
// =================================================

class BabyDog extends Dog {

    void weep() {

        System.out.println("Baby Dog is Weeping");
    }
}


// =================================================
// Main Class
// =================================================

public class MultilevelInheritanceExample {

    public static void main(String[] args) {

        // Creating object
        BabyDog dog1 = new BabyDog();

        // Accessing all methods
        dog1.eat();

        dog1.bark();

        dog1.weep();
    }
}