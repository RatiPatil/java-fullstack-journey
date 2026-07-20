package BasicProblems;

import java.util.Scanner;

public class PrintEvenNumbersFrom1ToN {
    public void printEvenNumbersFrom1ToN(int num){

        for(int i = 2 ; i<=num ; i+=2){
            // with if
//            if(i%2==0){
//                System.out.println(i);
//            }

            // without if

            System.out.println(i);
        }
    }

    public static void main(String [] args){
        PrintEvenNumbersFrom1ToN penf = new PrintEvenNumbersFrom1ToN();
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        penf.printEvenNumbersFrom1ToN(number);
    }
}
