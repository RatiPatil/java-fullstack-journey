package Array;
import java.util.Scanner;


public class ArrayPractice02 {

    public static void main(String [] args){

        Scanner sc = new Scanner (System.in);
        int mul = 1 ;

        int arr [] = new int[5];

        for(int i  = 0 ; i<= arr.length-1; i++){
            System.out.println("Enter a Eelement at index " + i );
            arr[i] = sc.nextInt();
            mul = mul*arr[i];

        }




        for(int nums : arr){
            System.out.println(nums);
        }


        System.out.println(" The multiplication  is the " + mul);





    }
}
