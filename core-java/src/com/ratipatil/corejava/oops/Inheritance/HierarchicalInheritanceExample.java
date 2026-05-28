package com.ratipatil.corejava.oops.Inheritance;

/*
 * HierarchicalInheritanceExample.java
 * ------------------------------------------------
 * This program demonstrates:
 * Hierarchical Inheritance
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
// Child Class 1
// =================================================

class Dog extends Animal {

    void bark() {

        System.out.println("Dog is Barking");
    }
}


// =================================================
// Child Class 2
// =================================================

class Cat extends Animal {

    void meow() {

        System.out.println("Cat is Meowing");
    }
}


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