package BasicProblems;
import java.util.*;


public class VotingEligibilityChecker {

    public static void main(String [] args){


        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();

        if (age >= 18){
            System.out.println("u are ready to vote");
        }else{

            System.out.println("apna time aagya");
        }
    }

}
