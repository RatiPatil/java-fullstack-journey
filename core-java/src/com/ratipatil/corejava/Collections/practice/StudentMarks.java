package com.ratipatil.corejava.Collections.practice;

import java.util.ArrayList;

public class StudentMarks {

    public static void main(String [] data) {



        ArrayList<Integer> marks = new ArrayList<>();


        marks.add(89);
        marks.add(67);
        marks.add(43);
        marks.add(65);

        for(Integer hello : marks){
            System.out.println(marks);



        }


        System.out.println(marks.get(0));



    }
}
