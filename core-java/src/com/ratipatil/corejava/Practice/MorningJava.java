package com.ratipatil.corejava.Practice;
class Student{
    int age;
    String name ;

    void display(int age , String name ){
        System.out.println(name);
        System.out.println(age);
    }
}


public class MorningJava {

    public static void main(String[] args){

        Student s1 = new Student();
        s1.display(45,"ratikant");
    }
}
