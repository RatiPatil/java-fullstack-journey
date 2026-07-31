package Array;

public class ArrayPractice03 {
    public static void main(String [] args){

        int arr [] = {1,2,3,4,5,6};
        int max = Integer.MIN_VALUE;

        for(int i = 0 ; i<=arr.length-1; i++){
            if(arr[i]>max){
               max = arr[i];
            }
        }

        System.out.println("The maximum value is :" + max);

    }
}
