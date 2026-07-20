package Array;

import static java.lang.Integer.MAX_VALUE;
import static java.lang.Integer.min;

public class MinimumNumberInMatrix {


    int minimumnumberinmatrix(int numbers[][]){



        int minimumvalue = MAX_VALUE;


        for(int i = 0 ; i<= numbers.length-1; i++){
            for(int j = 0 ; j<=numbers.length-1;j++){
                if(numbers[i][j] < minimumvalue){
                    minimumvalue = numbers[i][j];
                }
            }
        }

        return  minimumvalue;




    }

    public static void main(String[]args){
        int numbers[][] = {{1,2,3},{5,6,7},{6,7,8}};

        MinimumNumberInMatrix mini = new  MinimumNumberInMatrix ();

        int result = mini.minimumnumberinmatrix(numbers);

        System.out.println(result);
    }


}
