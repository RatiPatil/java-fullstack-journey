package BasicProblems;

import com.sun.java.accessibility.util.SwingEventMonitor;

import java.util.Scanner;

public class CalculateAreaOfRectangle {

    public double calculateAreaOfRectangle(double length , double width){

        double Area = length*width;

        return Area;



    }
    public static void main(String [] args){
        CalculateAreaOfRectangle car = new CalculateAreaOfRectangle();

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length : ");
        double len = sc.nextDouble();
        System.out.println("Enter Width :");
        double wid = sc.nextDouble();

        double result = car.calculateAreaOfRectangle(len,wid);

        System.out.println(result);
        sc.close();
    }
}
