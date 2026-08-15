package BasicProblems;

public class PrimeNum {
    public static void main(String [] arga){

        boolean isPrime = true ;

        int num = 9 ;


        if(num <= 1){

            isPrime = false;

        }else {
            for(int i = 2 ; i<= (num -1) ; i++){

                if(num%i==0){
                    isPrime = false;
                    break ;
                }

            }
        }

        if(isPrime){
            System.out.println("PrimeNumber");
        }else{
            System.out.println("not prime");
        }
    }
}
