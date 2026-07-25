package MathProblems;
import java.util.Scanner;

public class PowerOFTwoDemo {

    public String poweroftwodemo(int number){

        while (number>1){
            if(number%2!=0){
                return "not a power of two";
            }

            number = number/2;
        }

        return "power of two";
    }

    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        PowerOfTwo pot = new PowerOfTwo();
        System.out.println("Enter a number which number you want to check the power of two :");
        int num = sc.nextInt();

        String result = pot.poweroftwo(num);
        System.out.println(result);

    }
}
