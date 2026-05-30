package com.ratipatil.corejava.Multithreading;

/*
 * ThreadPriorityAndSleepExample.java
 * ------------------------------------------------
 * This program demonstrates:
 * 1. Thread Priority
 * 2. Thread Sleep
 */

// =================================================
// Thread Class
// =================================================

class MyThread extends Thread {

    @Override
    public void run() {

        for (int i = 1; i <= 5; i++) {

            System.out.println(
                    Thread.currentThread().getName()
                            + " : " + i);

            try {

                // Pause thread for 1 second
                Thread.sleep(1000);
            }

            catch (InterruptedException e) {

                System.out.println(e.getMessage());
            }
        }
    }
}


// =================================================
// Main Class
// =================================================

public class ThreadPriorityAndSleepExample {

    public static void main(String[] args) {

        // Creating Threads
        MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();

        // Setting Names
        t1.setName("Thread-A");
        t2.setName("Thread-B");

        // Setting Priorities
        t1.setPriority(Thread.MAX_PRIORITY); // 10
        t2.setPriority(Thread.MIN_PRIORITY); // 1

        // Starting Threads
        t1.start();
        t2.start();

        // Printing Priorities
        System.out.println(
                t1.getName()
                        + " Priority : "
                        + t1.getPriority());

        System.out.println(
                t2.getName()
                        + " Priority : "
                        + t2.getPriority());
    }
}