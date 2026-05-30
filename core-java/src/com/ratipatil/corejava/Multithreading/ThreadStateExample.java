package com.ratipatil.corejava.Multithreading;

/*
 * ThreadStateExample.java
 * ------------------------------------------------
 * This program demonstrates:
 * 1. Thread States
 * 2. NEW State
 * 3. RUNNABLE State
 * 4. TIMED_WAITING State
 * 5. TERMINATED State
 */

// =================================================
// Thread Class
// =================================================

class MyThread extends Thread {

    @Override
    public void run() {

        try {

            // Thread sleeps for 2 seconds
            Thread.sleep(2000);
        }

        catch (InterruptedException e) {

            System.out.println(e.getMessage());
        }

        System.out.println("Thread Execution Completed");
    }
}


// =================================================
// Main Class
// =================================================

public class ThreadStateExample {

    public static void main(String[] args) throws Exception {

        // Creating Thread Object
        MyThread t1 = new MyThread();

        // NEW State
        System.out.println(
                "State After Creation : "
                        + t1.getState());

        // Start Thread
        t1.start();

        // RUNNABLE State
        System.out.println(
                "State After Start : "
                        + t1.getState());

        // Wait a little
        Thread.sleep(500);

        // TIMED_WAITING State
        System.out.println(
                "State During Sleep : "
                        + t1.getState());

        // Wait for Thread Completion
        t1.join();

        // TERMINATED State
        System.out.println(
                "State After Completion : "
                        + t1.getState());
    }
}