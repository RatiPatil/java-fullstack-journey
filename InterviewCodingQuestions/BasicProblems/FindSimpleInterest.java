package BasicProblems;

import Array.FindMissingNumber;

import java.util.Scanner;

public class FindSimpleInterest {

    public double findingsimpleintrest(double principleamout, double rateofintrest , double time){

        double  simpleintrest = 0f ;


        simpleintrest = (principleamout * rateofintrest* time) /100;
        return simpleintrest;
    }

    public  static void main(String [] args){

        FindSimpleInterest fsi = new FindSimpleInterest();

        Scanner sc = new Scanner(System.in);

        double principle = sc.nextDouble();
        double rateofintrest =  sc.nextDouble();
        double  time = sc.nextDouble();

       double result =  fsi.findingsimpleintrest(principle,rateofintrest,time);

        System.out.println(result );
    }





}
