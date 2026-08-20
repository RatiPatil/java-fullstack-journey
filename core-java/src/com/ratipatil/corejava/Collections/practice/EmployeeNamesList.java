package com.ratipatil.corejava.Collections.practice;

import java.util.ArrayList;
import java.util.List;

public class EmployeeNamesList {

    public static void main(String [] data){


        List<String> employee  = new ArrayList<>();

        employee.add("Ravi");
        employee.add("Priya");
        employee.add("Akash");
        employee.add("Ravi");
        employee.add("Neha");
        employee.add("Priya");


        for(String employees : employee){
            System.out.println(employees);
        }




    }
}
