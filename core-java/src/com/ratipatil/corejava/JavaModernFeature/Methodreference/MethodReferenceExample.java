package com.ratipatil.corejava.JavaModernFeature.Methodreference;

import java.util.Arrays;
import java.util.List;

/*
 * ==========================================================
 * MethodReferenceExample.java
 * ==========================================================
 * Method Reference provides a shorter syntax
 * for calling existing methods.
 * ==========================================================
 */

public class MethodReferenceExample {

    public static void main(String[] args) {

        List<String> names =
                Arrays.asList("Amit", "Rahul", "Neha");

        /*
         * Lambda Expression
         */
        System.out.println("Using Lambda:");

        names.forEach(name -> System.out.println(name));

        /*
         * Method Reference
         */
        System.out.println("\nUsing Method Reference:");

        names.forEach(System.out::println);
    }
}