package BasicProblems;
import java. util.*;

public class AverageOfThreeIntegers {


    public static void averageofthreeintegers(int num1 , int num2, int num3){


        int avg = (num1+num2+num3 )/ 3;

        System.out.println(avg);


    }


    public static void main(String [] args){


        Scanner sc = new Scanner(System.in);

        int number1 = sc.nextInt();
        int number2 = sc.nextInt();

        int number3= sc.nextInt();


        averageofthreeintegers(number1,number2,number3);




    }





}
