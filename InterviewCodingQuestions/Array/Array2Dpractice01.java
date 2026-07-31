package Array;
import java.util.Scanner;
// sum of elements
public class Array2Dpractice01 {
    public static void main(String [] args){
        Scanner sc = new Scanner (System.in);
        int arr[][]= new int[3][4];
        int sum = 0 ;
        for(int i = 0 ; i<= arr.length-1; i++){
            for(int j = 0; j<=arr[i].length-1; j++){
                System.out.println("Enter a element row " + i + " and column " + j);
                arr[i][j] = sc.nextInt();
                sum = sum+arr[i][j];
            }
        }

        for(int k = 0 ; k<=arr.length-1; k++){
            for(int m = 0; m<=arr[k].length-1;m++){

                System.out.print(arr[k][m]+" ");

            }
            System.out.println(" ");
        }



        System.out.println(sum);

    }
}
