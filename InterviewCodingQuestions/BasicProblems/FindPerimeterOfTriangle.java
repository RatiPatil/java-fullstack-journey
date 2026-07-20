package BasicProblems;
import java.util.Scanner;

public class FindPerimeterOfTriangle {

    public double findperimeteroftriangle(double side1, double side2, double side3){
        double perimeter = 0 ;

        perimeter = side1+side2+side3;


        return perimeter;

    }

    public static void main(String [] args){

        FindPerimeterOfTriangle fpot = new FindPerimeterOfTriangle();



        Scanner sc = new Scanner(System.in);

        double side1 = sc.nextDouble();
        double side2 = sc.nextDouble();
        double side3 = sc.nextDouble();

        double result = fpot.findperimeteroftriangle(side1,side2,side3);
        System.out.println(result);
        sc.close();

    }


}
