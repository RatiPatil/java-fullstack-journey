package BasicProblems;

public class CalculatePercentage {

    public static void calculatePercentage (double obtmarks , double outofmarks){


        double result  =( obtmarks/outofmarks )*100;
        System.out.println(result);


    }

    public static  void main(String [] args){

        calculatePercentage(12.5,500);


    }


}
