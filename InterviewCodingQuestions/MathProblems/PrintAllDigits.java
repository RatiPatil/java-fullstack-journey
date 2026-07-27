package MathProblems;
import java.util.Scanner;

public class PrintAllDigits {
    public static void main(String [] args){
        Scanner sc = new Scanner (System.in);

        int number = sc.nextInt();

        while(number>0){
            int rem = number%10;
            System.out.println(rem);
            number = number/10;
        }

    }
}
