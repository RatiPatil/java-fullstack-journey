package com.ratipatil.corejava.JavaModernFeature.SealedClass;/*
 * ==========================================================
 * SealedClassExample.java
 * ==========================================================
 * Sealed Classes were introduced in Java 17.
 *
 * A sealed class restricts which classes
 * can inherit from it.
 * ==========================================================
 */

/*
 * Only Car and Bike are allowed
 * to extend Vehicle.
 */
sealed class Vehicle permits Car, Bike {

    public void start() {
        System.out.println("Vehicle Started");
    }
}

/*
 * Final class cannot be extended further.
 */
final class Car extends Vehicle {

    public void showType() {
        System.out.println("This is a Car");
    }
}

/*
 * Final class cannot be extended further.
 */
final class Bike extends Vehicle {

    public void showType() {
        System.out.println("This is a Bike");
    }
}

public class SealedClassExample {

    public static void main(String[] args) {

        Car car = new Car();
        car.start();
        car.showType();

        System.out.println();

        Bike bike = new Bike();
        bike.start();
        bike.showType();
    }
}