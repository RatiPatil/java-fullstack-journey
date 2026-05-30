package com.ratipatil.corejava.Multithreading;

/*
 * MultipleThreadsExample.java
 * -------------------------------------
 * Demonstrates multiple threads.
 */

// =====================================
// First Thread
// =====================================

class MyThread1 extends Thread {

    @Override
    public void run() {

        for (int i = 1; i <= 5; i++) {

            System.out.println("Thread 1 : " + i);
        }
    }
}

// =====================================
// Second Thread
// =====================================

class MyThread2 extends Thread {

    @Override
    public void run() {

        for (int i = 1; i <= 5; i++) {

            System.out.println("Thread 2 : " + i);
        }
    }
}

// =====================================
// Main Class
// =====================================

public class MultipleThreadsExample {

    public static void main(String[] args) {

        // Creating Thread Objects
        MyThread1 t1 = new MyThread1();
        MyThread2 t2 = new MyThread2();

        // Starting Threads
        t1.start();
        t2.start();
    }
}