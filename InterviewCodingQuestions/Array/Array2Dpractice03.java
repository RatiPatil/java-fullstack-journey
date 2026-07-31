package Array;

// MAXIMUM ELEMENT
public class Array2Dpractice03 {

    public static void main(String [] args){
        int arr [][] = {{1,25,35},{13,24,33}};

        int max = Integer.MIN_VALUE;



        for(int i = 0 ; i<=arr.length-1; i++){
            for(int j = 0 ; j<=arr[i].length-1; j++){
                if(arr[i][j]>max){
                    max = arr[i][j];
                }
            }
        }

        System.out.println(max);
    }
}
