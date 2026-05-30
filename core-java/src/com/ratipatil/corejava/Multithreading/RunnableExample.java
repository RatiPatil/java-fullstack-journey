package com.ratipatil.corejava.Multithreading;

/*
 * RunnableExample.java
 * ------------------------------------------------
 * This program demonstrates:
 * 1. Runnable Interface
 * 2. Creating thread using Runnable
 * 3. Starting thread using Thread object
 */

// =================================================
// Runnable Class
// =================================================

class MyRunnable implements Runnable {

    @Override
    public void run() {

        // Task performed by thread
        for (int i = 1; i <= 5; i++) {

            System.out.println("Runnable Thread : " + i);
        }
    }
}


// =================================================
// Main Class
// =================================================

public class RunnableExample {

    public static void main(String[] args) {

        // Creating Runnable Object
        MyRunnable task = new MyRunnable();

        // Passing Runnable object to Thread
        Thread t1 = new Thread(task);

        // Starting Thread
        t1.start();

        System.out.println("Main Thread Running...");
    }
}