package com.ratipatil.corejava.Collections;

import java.util.ArrayList;
import java.util.Collection;

/*
 * CollectionAPIExample.java
 * ------------------------------------------------
 * This program demonstrates:
 * 1. Collection Interface
 * 2. Adding elements
 * 3. Displaying elements
 */

public class CollectionAPIExample {

    public static void main(String[] args) {

        // Collection reference
        Collection<String> names = new ArrayList<>();

        // Adding elements
        names.add("Ratikant");
        names.add("Rahul");
        names.add("Amit");

        // Displaying Collection
        System.out.println(names);

        // Collection size
        System.out.println("Size: " + names.size());
    }
}