package Array;

public class FindMissingNumber {

    int missingnumber(int number[]){

        int exceptedsum = number.length+1;
        int actualsum = 0;

        exceptedsum = (exceptedsum*(exceptedsum+1))/2;

        for(int i = 0 ; i<= number.length-1; i++){

            actualsum = actualsum+number[i];


        }

        int missingnumber = exceptedsum - actualsum;

        return missingnumber;





    }


    public static void main(String [] args){

      int number [] = {1,2,3,4,6,7,8};

      FindMissingNumber fmn = new FindMissingNumber();

      int result = fmn.missingnumber(number);

        System.out.println(result);



    }


}
