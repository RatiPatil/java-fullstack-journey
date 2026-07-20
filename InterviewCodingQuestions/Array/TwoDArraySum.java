package Array;

public class TwoDArraySum {

    int  twodarray(int numbers[] []){

        int sum = 0;
        for(int i = 0 ; i<=numbers.length-1; i++){
            for(int j = 0 ; j <=numbers[i].length-1;j++){

                sum = sum+numbers[i][j];

            }

        }



    return  sum ;


    }

    public static void main(String [] args){


        TwoDArraySum tds = new TwoDArraySum();
        int numbers[][]={{1,3,4},{2,3,4}};
        int result = tds.twodarray(numbers);
        System.out.println(result);



    }



}
