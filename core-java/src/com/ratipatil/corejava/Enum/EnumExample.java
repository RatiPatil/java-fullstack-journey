package com.ratipatil.corejava.Enum;

/*
 * Enum Example
 */

enum Status {

    RUNNING,
    FAILED,
    SUCCESS
}

public class EnumExample {

    public static void main(String[] args) {

        Status s = Status.SUCCESS;

        System.out.println(s);
    }
}