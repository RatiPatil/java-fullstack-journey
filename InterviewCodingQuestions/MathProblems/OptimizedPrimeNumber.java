package MathProblems;

public class OptimizedPrimeNumber {
    public static void main(String [] args){
        int number = 120;

        if(number<=1){
            System.out.println("not a prime");
            return;
        }

        for(int i = 2 ; i*i<=number; i++){
            if(number%i==0){
                System.out.println("not a prime");
                return;
            }
        }
        System.out.println("prime");
    }


}
