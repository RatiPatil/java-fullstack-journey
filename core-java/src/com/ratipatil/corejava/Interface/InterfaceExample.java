package com.ratipatil.corejava.oops.interfaces;

/*
 * Interface Example
 */

interface Animal {

    void sound();
}

class Dog implements Animal {

    public void sound() {

        System.out.println("Dog Barkss");
    }
}

public class InterfaceExample {

    public static void main(String[] data) {

        Dog dog1 = new Dog();

        dog1.sound();
    }
}