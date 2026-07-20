package BasicProblems;

public class PrimeDemo {

    public static void main(String [] args) {
        int num = 13;
        boolean isPrime = true;

        if (num <= 1) {
            isPrime = false;
        }else {
            for(int i = 2 ; i<num; i++){
                if(num%i==0){
                    isPrime = false;
                }
            }
        }

        if(isPrime){
            System.out.println("this is prime number");
        }else{
            System.out.println("this is not prime number");
        }

    }
}
