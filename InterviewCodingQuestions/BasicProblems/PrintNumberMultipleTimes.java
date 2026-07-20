package BasicProblems;

import java.util.Scanner;

public class PrintNumberMultipleTimes {

   public void printNumberMultipleTimes(int num1 , int num2){

       System.out.println(num2);
       for(int i = 1 ; i<=num2 ; i++){
           System.out.println(num1);
       }
   }

   public static void main(String [] args){
       PrintNumberMultipleTimes pnmt = new PrintNumberMultipleTimes();
       Scanner sc = new Scanner(System.in);

       int number1 = sc.nextInt();
       int number2 = sc.nextInt();

       pnmt.printNumberMultipleTimes(number1,number2);
   }
}
