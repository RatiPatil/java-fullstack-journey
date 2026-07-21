package MathProblems;
import java.util.Scanner;

public class PalindromeNumber {

    public static void main (String [] args ){

        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();
        int temp = number;
        int rev= 0;
        while(number>0){
            int rem = number %10;
             rev = rev*10+rem;
            number = number/10;
        }

        if(temp==rev){
            System.out.println("palindrom");
        }else{
            System.out.println("not palindrom");
        }

    }
}
