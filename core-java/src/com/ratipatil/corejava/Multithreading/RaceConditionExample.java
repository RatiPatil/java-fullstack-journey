package com.ratipatil.corejava.Multithreading;

/*
 * RaceConditionExample.java
 * ------------------------------------------------
 * This program demonstrates:
 * 1. Race Condition
 * 2. Shared Variable
 * 3. Multiple Threads accessing same data
 */

// =================================================
// Counter Class
// =================================================

class Counter {

    int count = 0;

    // Shared Method
    public void increment() {

        count++;
    }
}


// =================================================
// Main Class
// =================================================

public class RaceConditionExample {

    public static void main(String[] args) throws Exception {

        // Shared Object
        Counter counter = new Counter();

        // Thread 1
        Thread t1 = new Thread(() -> {

            for (int i = 1; i <= 1000; i++) {

                counter.increment();
            }
        });

        // Thread 2
        Thread t2 = new Thread(() -> {

            for (int i = 1; i <= 1000; i++) {

                counter.increment();
            }
        });

        // Start Threads
        t1.start();
        t2.start();

        // Wait for Threads
        t1.join();
        t2.join();

        // Expected = 2000
        // Actual may be less than 2000

        System.out.println("Count = " + counter.count);
    }
}