//Scenario: Student Marks Management System
//
//Imagine you are developing a small application for a school.
//
//Problem Statement
//
//A class has 10 students. The marks of all students (out of 100) are stored in an array.
//
//Your program should perform the following tasks using different methods:
//
//Store the marks of all 10 students in an array.
//Create a method to display all the marks.
//Create a method to calculate the total marks of the class.
//Create a method to calculate the average marks.
//Create a method to find the highest mark.
//Create a method to find the lowest mark.
//Create a method to count how many students passed (marks ≥ 35).
//Create a method to count how many students failed (marks < 35).
//Create a method to search whether a particular mark (entered by the user) exists in the array.
//Display all the results in a readable format.

import java.util.ArrayList;
import java.util.Scanner;



 class Array{

    void studentmarks(int marks[]){

        for(int i  = 0  ; i<=marks.length-1; i++){
            int numbers = marks[i];
            System.out.println(numbers);
        }



    }

    int totalmarksofclass(int marks[]){

        int totalmarks = 0;

        for(int i = 0 ; i<=marks.length-1; i++){

            totalmarks = totalmarks+marks[i];

        }

        return totalmarks;

    }


    double avgmarksofstudent (int marks[]){



                int actuallength = marks.length;

               double avgmarks = (double)totalmarksofclass(marks) / actuallength;

               return  avgmarks;



    }

    int highestmarks(int[] marks){

        int highnumber = marks[0];



        for(int i = 0 ;i<marks.length; i++){

            if(marks[i] > highnumber){
               highnumber = marks[i];
            }


        }


        return highnumber;
    }


    int lowestnumber(int[] marks){

        int lownumber = marks[0];


        for(int i = 0 ; i<marks.length; i++){
            if(marks[i]<lownumber){
                lownumber = marks[i];

            }
        }

        return lownumber;



    }


    int studentpassed(int marks[]){
        int count = 0;


        for(int i = 0 ; i<=marks.length-1;i++){
            if(marks[i] >35){
                count+=1;
            }
        }
        return count;
    }


    int studentfailed(int marks[]){

        int count = 0;

        for(int i = 0 ; i<= marks.length-1; i++){
            if(marks[i]<35){
                count+=1;
            }
        }
        return count;



    }


    boolean isexit(int marks[], int user){
        for(int i = 0 ; i<=marks.length-1; i++){
            if(user==marks[i]){
                return true;
            }
        }
        return false;
    }

    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        Array arr = new Array();
        int marks[] = {78, 45, 90, 32, 67, 55, 29, 88, 76, 41};
        while(true){

        System.out.println("========================================");
        System.out.println("      STUDENT MARKS MANAGEMENT");
        System.out.println("========================================");
        System.out.println("1. Display All Student Marks");
        System.out.println("2. Calculate Total Marks of the Class");
        System.out.println("3. Calculate Average Marks");
        System.out.println("4. Find Highest Mark");
        System.out.println("5. Find Lowest Mark");
        System.out.println("6. Count Passed Students");
        System.out.println("7. Count Failed Students");
        System.out.println("8. Search a Student Mark");
        System.out.println("9. Exit");
        System.out.println("========================================");
        System.out.print("Enter your choice: ");

        int number = sc.nextInt();



            switch (number) {
                case 1:
                    arr.studentmarks(marks);
                    break;

                case 2:
                    System.out.println("Total marks : " + arr.totalmarksofclass(marks));
                    break;

                case 3:
                    System.out.println("Avrage marks of students : " + arr.avgmarksofstudent(marks));
                    break;

                case 4:
                    System.out.println("Highest Number of Students : " + arr.highestmarks(marks));
                    break;

                case 5:
                    System.out.println("Loswest Number of Students : " + arr.lowestnumber(marks));
                    break;

                case 6:
                    System.out.println("these studetns are passed " + arr.studentpassed(marks));
                    break;


                case 7:
                    System.out.println("Students failed : " + arr.studentfailed(marks));


                case 8:
                    System.out.println("enter a number ");
                    int user = sc.nextInt();

                    System.out.println(arr.isexit(marks, user));

                    break;

                default: {
                    System.out.printf("Program End ... ");
                }

            }
        }


    }

 }

