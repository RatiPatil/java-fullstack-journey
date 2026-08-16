package com.ratipatil.corejava.oops.polymorphismpractice;

public class Student {

    public void add(int a  , int b ){
        System.out.println("The sum of the Numbers : " + a+b);
    }
    public void studentWork(){
        System.out.println("Student doing his work ....");
    }
}


class NewStudent extends  Student{

    public void studentWork(){
        System.out.println("New student also doing his work  ");

    }

}

public static void main(String [] data){

    Student st = new NewStudent();

}
