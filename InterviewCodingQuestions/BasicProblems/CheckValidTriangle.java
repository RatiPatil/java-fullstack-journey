package BasicProblems;

import java.util.Scanner;

public class CheckValidTriangle {

    String checkValidTriangle (int side1, int side2, int side3){

        if(side1 + side2 > side3 && side1 + side3> side2 && side2 + side3 >side1){
            return "Valid Triangle";
        }else{
            return "Invalid Triangle";
        }
    }

    public static void main(String [] args){

        Scanner sc = new Scanner(System.in);
        CheckValidTriangle cvt = new CheckValidTriangle();
        System.out.println("Enter Side 1 : ");
        int side1 = sc.nextInt();
        System.out.println("Enter Side 2 : ");
        int side2 = sc.nextInt();
        System.out.println("Enter Side 3 : ");
        int side3 = sc.nextInt();

        String result = cvt.checkValidTriangle(side1,side2,side3);

        System.out.println(result);


    }

}
