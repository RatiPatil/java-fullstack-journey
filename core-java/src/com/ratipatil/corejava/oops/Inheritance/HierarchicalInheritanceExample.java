package com.ratipatil.corejava.oops.Inheritance;

/*
 * HierarchicalInheritanceExample.java
 * ------------------------------------------------
 * This program demonstrates:
 * Hierarchical Inheritance
 */




// =================================================
// Main Class
// =================================================

public class HierarchicalInheritanceExample {

    public static void main(String[] args) {

        // Creating Dog Object
        Dog dog1 = new Dog();

        dog1.eat();

        dog1.bark();


        System.out.println();


        // Creating Cat Object
        Cat cat1 = new Cat();

        cat1.eat();

        cat1.meow();
    }
}