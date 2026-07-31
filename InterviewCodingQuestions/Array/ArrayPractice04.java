package Array;

public class ArrayPractice04 {
    public static void main(String [] args){

        int arr [] = {1,2,3,4,5,6};
        int n = arr.length;
        int min = Integer.MAX_VALUE;

        for(int i = 0 ; i<=n-1; i++){
            if(arr[i]<min){
                min = arr[i];
            }
        }

        System.out.println("The minimum value is :" + min);

    }
}
