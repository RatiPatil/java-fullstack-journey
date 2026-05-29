package com.ratipatil.corejava.AnonymousClass;

/*
 * Anonymous Class Example
 */

abstract class Animal {

    abstract void sound();
}

public class AnonymousClassExample {

    public static void main(String[] args) {

        // Anonymous Class
        Animal obj = new Animal() {

            void sound() {

                System.out.println("Dog Barks");
            }
        };

        obj.sound();
    }
}