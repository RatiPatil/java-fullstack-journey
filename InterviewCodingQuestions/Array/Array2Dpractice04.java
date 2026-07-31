package Array;
import java.util.Scanner;

// MINIMUM ELEMENT

public class Array2Dpractice04 {

    public static void main(String [] args){

        Scanner sc = new Scanner(System.in);

        int arr [][] = new int [3][3];

        for(int i = 0 ; i<= arr.length-1; i++){
            for(int j = 0 ; j<=arr[i].length-1; j++){
                System.out.println("Enter a element row no " + i+ " and column" + j);
                arr[i][j] = sc.nextInt();


            }
        }
        int minvalue = Integer.MAX_VALUE;
        for(int m = 0 ; m<=arr.length-1; m++){
            for(int n = 0 ; n<=arr[m].length-1;n++){
                if(arr[m][n] < minvalue){
                    minvalue = arr[m][n];
                }

            }
        }

        System.out.println("The Minimum value is : " + minvalue);



    }
}
