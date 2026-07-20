package BasicProblems;

public class CheckPrimeNumber {
    public static void main (String [] args){

        int number  = 9 ;

        boolean isPrime = true;

        if(number<=1){
            isPrime = false;
        }else
            for(int i = 2 ; i<number ; i++){
                if(number%i==0){

                    isPrime = false;
                    break;


                }


        }


       if(isPrime){
           System.out.println("this is prime number");
       }else{
           System.out.println("this is not prime nuber ");
       }
    }
}
