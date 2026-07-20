package Array;

public class MatrixMultiplication {

    int multiplicationtwodarray(int numbers[][]){

        int multiplicationofmatrix = 1;


        for(int i = 0 ; i<=numbers.length-1; i++){
            for(int j = 0 ; j<=numbers[i].length-1; j++){

                multiplicationofmatrix = multiplicationofmatrix*numbers[i][j];
            }
        }


        return  multiplicationofmatrix;

    }

    public static void main(String [] args){

        int numbers[][] = {{1,2,3},{1,2,3}};

        MatrixMultiplication mm = new MatrixMultiplication();



        int result = mm.multiplicationtwodarray(numbers);
        System.out.println(result);

    }



}
