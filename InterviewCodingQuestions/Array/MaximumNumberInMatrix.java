package Array;

public class MaximumNumberInMatrix {


    public  int  maxnumberinmatrix(int numbers[] []){

        int max = Integer.MIN_VALUE;


        for(int i = 0 ; i<=numbers.length-1; i++){
            for(int j = 0 ; j<=numbers.length-1; j++){
                if(numbers[i][j]>max){
                    max=numbers[i][j];
                }
            }
        }
        return max;


    }

    public static void main(String [] args){

        int numbers[][] = {{1,2,3},{3,4,5},{5,6,7}};
       MaximumNumberInMatrix mm = new MaximumNumberInMatrix();


        int result = mm.maxnumberinmatrix(numbers);

        System.out.println(result);




    }



}
