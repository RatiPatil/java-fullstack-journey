package com.ratipatil.corejava.Multithreading;

/*
 * ThreadExample.java
 * ------------------------------------------------
 * This program demonstrates:
 * 1. Creating a Thread
 * 2. Extending Thread class
 * 3. Running a Thread
 */

// =================================================
// Child Thread Class
// =================================================

class MyThread extends Thread {

    @Override
    public void run() {

        /*
         * Code inside run()
         * executes when thread starts
         */

        System.out.println("Child Thread is Running...");
    }
}


// =================================================
// Main Class
// =================================================

public class ThreadExample {

    public static void main(String[] args) {

        // Creating Thread Object
        MyThread t1 = new MyThread();

        // Starting Thread
        t1.start();

        // Main Thread
        System.out.println("Main Thread is Running...");
    }
}