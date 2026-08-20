package com.ratipatil.corejava.Collections.practice;

import java.util.ArrayList;
import java.util.List;

public class ListBasicsPractice {

    public static void main(String [] args){


        List<String> newList = new ArrayList<>();

        newList.add("Rahul");
        newList.add("Amit");
        newList.add("sneha");
        newList.add("Priya");
        newList.add("Rohit");

        System.out.println(newList);

        System.out.println(newList.get(2));

        System.out.println(newList.remove("Rohit"));

        System.out.println(newList.contains("Sneha"));

        System.out.println(newList.stream().count());

        newList.set(2 , "Sneha");


        for(String student:  newList ){
            System.out.println(student);
        }


    }
}
