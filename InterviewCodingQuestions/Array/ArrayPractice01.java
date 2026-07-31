package Array;
import java.util.Scanner;


public class ArrayPractice01 {

    public static void main(String [] args){

        Scanner sc = new Scanner (System.in);
        int sum = 0 ;

        int arr [] = new int[5];

        for(int i  = 0 ; i<= arr.length-1; i++){
            System.out.println("Enter a Eelement at index " + i );
            arr[i] = sc.nextInt();
            sum = sum+arr[i];

        }




        for(int nums : arr){
            System.out.println(nums);
        }


        System.out.println(" The sum is the " + sum);





    }
}
