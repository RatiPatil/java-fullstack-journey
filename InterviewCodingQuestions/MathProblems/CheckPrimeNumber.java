package MathProblems;
import java.util.Scanner;

public class CheckPrimeNumber {

    public String checkprimenumber(int number){

        boolean isPrime = true;
        if(number<=1){
            isPrime = false;
        }else{
            for(int i = 2 ; i<number;i++){
                if(number % i == 0){
                    isPrime = false;
                    break;
                }
            }
        }
        if (isPrime){
            return "prime number";
        }else{
            return "not prime number";
        }

    }

    public static void main (String [] args){

        CheckPrimeNumber  cpn = new CheckPrimeNumber();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number to check prime number : ");
        int num = sc.nextInt();



        String result = cpn.checkprimenumber(num);
        System.out.println(result);

        sc.close();
    }
}
