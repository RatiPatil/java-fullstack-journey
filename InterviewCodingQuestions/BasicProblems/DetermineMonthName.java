package BasicProblems;


import java.util.Scanner;

public class DetermineMonthName {

    String determineMonthName(int num) {
        switch (num) {
            case 1:
                return "Januray";


            case 2:
                return "February";

            case 3:
                return "March";


            case 4:
                return "April";


            case 5:
                return "May";


            case 6:
                return "June";


            case 7:
                return "July";


            case 8:
                return "August";


            case 9:
                return "September ";


            case 10:
                return "Octomber";


            case 11:
                return "November";

            case 12:
                return "December";



            default:
                return "Invalid Month number , Please enter valid month number...";
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();

        DetermineMonthName dmn = new DetermineMonthName();
        System.out.println(dmn.determineMonthName(number));


    }
}

