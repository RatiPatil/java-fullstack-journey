package BasicProblems;

import java.util.Scanner;

public class PrintMaximumOfThreeNumbers {
    public void printMaximumOfThreeNumbers(int num1, int num2, int num3){
            if(num1>=num2 && num1 >= num3){
                System.out.println(num1);
            }else if(num2 >= num1 && num2 >= num3){
                System.out.println(num2);
            }else{
                System.out.println(num3);
            }
    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        PrintMaximumOfThreeNumbers pmtn = new PrintMaximumOfThreeNumbers();
        int number1 = sc.nextInt();
        int number2  = sc.nextInt();
        int number3 = sc.nextInt();

        pmtn.printMaximumOfThreeNumbers(number1,number2,number3);
    }
}
