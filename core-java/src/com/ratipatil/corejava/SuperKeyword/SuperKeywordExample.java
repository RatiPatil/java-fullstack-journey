package com.ratipatil.corejava.SuperKeyword;

/*
 * SuperKeywordExample.java
 * ------------------------------------------------
 * This program demonstrates:
 * 1. super keyword
 * 2. Parent class variables
 * 3. Parent class constructor
 */

class Animal {

    String color = "White";


    // Parent Constructor
    Animal() {

        System.out.println("Animal Constructor Called");
    }
}


class Dog extends Animal {

    String color = "Black";


    Dog() {

        // Calling parent constructor
        super();

        System.out.println("Dog Constructor Called");
    }


    void displayColor() {

        // Accessing parent class variable
        System.out.println("Parent Color : "
                + super.color);

        // Accessing child class variable
        System.out.println("Child Color : "
                + color);
    }
}


public class SuperKeywordExample {

    public static void main(String[] args) {

        // Creating object
        Dog dog1 = new Dog();

        // Calling method
        dog1.displayColor();
    }
}