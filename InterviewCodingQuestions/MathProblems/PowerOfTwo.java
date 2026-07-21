package MathProblems;
import java.util.Scanner;

public class PowerOfTwo {

    public String poweroftwo (int number){
        if(number<=0){
            return "not power of 2";
        }
        while(number>1){
            if(number%2 != 0){
                return "not power of 2";
            }

            number = number/2;
        }

        return "power of 2";

    }

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number : ");
        int num = sc.nextInt();

        PowerOfTwo pot = new PowerOfTwo();

        String result = pot.poweroftwo(num);
        System.out.println(result);

        sc.close();

    }

}
