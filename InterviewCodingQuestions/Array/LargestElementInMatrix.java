package Array;
import java.util.Scanner;


public class LargestElementInMatrix {
    public int argestElementInMatrix(int nums[][]){
        int largestnumber = Integer.MIN_VALUE;

        for(int i= 0 ; i<=nums.length-1; i++){
            for(int j = 0 ; j<=nums.length-1; j++){
                if(nums[i][j]>largestnumber){
                    largestnumber = nums[i][j];
                }
            }


        }
        return largestnumber;
    }

    public static void main(String args []){
        Scanner sc = new Scanner(System.in);

        int arr [][] = new int  [3][3];


        //input

        for(int i = 0 ; i<=arr.length-1; i++ ){
            for(int j = 0 ; j<= arr.length-1;j++){
                arr[i][j]= sc.nextInt();
            }
        }

        LargestElementInMatrix lei = new LargestElementInMatrix();

        int result = lei.argestElementInMatrix(arr);

        System.out.println(result);
    }

}
