package com.ratipatil.corejava.Enum;

/*
 * Enum Switch Example
 */

enum Day {

    MONDAY,
    TUESDAY,
    WEDNESDAY
}

public class EnumSwitchExample {

    public static void main(String[] args) {

        Day day = Day.MONDAY;

        // if condition
        if(day == Day.MONDAY) {

            System.out.println("Start of Week");
        }

        // switch condition
        switch(day) {

            case MONDAY:

                System.out.println("Monday Selected");

                break;

            case TUESDAY:

                System.out.println("Tuesday Selected");

                break;

            default:

                System.out.println("Other Day");
        }
    }
}