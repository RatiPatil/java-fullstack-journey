package com.ratipatil.corejava.Enum;

/*
 * Enum Constructor Example
 */

enum Laptop {

    HP(50000),
    DELL(60000),
    ASUS(70000);

    int price;

    Laptop(int price) {

        this.price = price;
    }

    void displayPrice() {

        System.out.println(price);
    }
}

public class EnumConstructorExample {

    public static void main(String[] args) {

        Laptop.HP.displayPrice();
    }
}