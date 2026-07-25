package Array;

import java.util.Scanner;
import java.util.Arrays;

public class ArrayDynamic {

    public static void main(String [] args){

        Scanner sc = new Scanner(System.in);

        int number [] = new int [5];

        for(int i = 0 ;i <= number.length-1; i++){

             number [i] = sc.nextInt();
        }
        System.out.print(Arrays.toString(number));

        sc.close();



    }
}
