package Array;

import java.util.Scanner;

public class MatrixRowWiseSum {
    public static void main(String [] args){

        Scanner sc = new Scanner(System.in);

        int arr [][] = new int [3][3];

        int sum = 0 ;

        int m,n;


        for( m = 0 ; m<arr.length; m++){
            for( n = 0 ; n<arr[m].length; n++)
            {
                arr[m][n] = sc.nextInt();
            }

        }

        for(int i = 0 ; i<= arr.length-1;i++){

            for(int j = 0 ; j<=arr[i].length-1 ; j++){

                sum = sum+arr[i][j];

            }

            System.out.print("Row No "+ i + " " + sum) ;

            System.out.println(" ");

            sum = 0;



        }



    }
}
