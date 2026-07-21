package MathProblems;

public class SumOfDigits {

    public static void main(String [] args){
        int sum = 0 ;
        int num = 15 ;

        while (num>0){
            int rem = num%10;
            sum+=rem;
            num= num/10;
        }

        System.out.println(sum);
    }
}
