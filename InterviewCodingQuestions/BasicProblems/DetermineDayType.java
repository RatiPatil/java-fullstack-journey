package BasicProblems;

import java.util.Scanner;

public class DetermineDayType {

    public String determineDayType(int num ){
        if(num == 1 || num == 2 || num == 3 || num == 4 || num == 5 ){
            return "weekday";
        }else if(num ==7 || num == 6){
            return "weekend";
        }


        return "invalid";
    }

    public static void main(String [] args){
        DetermineDayType ddt = new DetermineDayType();

        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();

       String result =  ddt.determineDayType(number);

        System.out.println(result);



    }
}
