package MathProblems;

import java.util.Scanner;

public class FindFactorial {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number you want to check the factorial : ");
        int number = sc.nextInt();
        int fact = 1 ;
        for (int i = 1 ; i<= number ; i++){
            fact = fact*i;

        }

        System.out.println(" The factorial of  : " + number + " = " + fact);
    }
}
