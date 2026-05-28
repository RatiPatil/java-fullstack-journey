package com.ratipatil.corejava.AnonymousObject;

/*
 * AnonymousObjectExample.java
 * ------------------------------------------------
 * This program demonstrates:
 * 1. Anonymous Object
 * 2. Object without reference variable
 */

class Mobile {

    void showMessage() {

        System.out.println("Anonymous Object Example");
    }
}


public class AnonymousObjectExample {

    public static void main(String[] args) {

        // =================================================
        // Anonymous Object
        // Object created without reference variable.
        // =================================================

        new Mobile().showMessage();
    }
}