package MathProblems;

public class PrintPrimeNumbers1ToN {

    public void printPrimeNumbers1ToN(int num){


            for(int i = 2 ; i<=num;i++){

                boolean isPrime = true;

                for(int j = 2 ; j< i; j++){

                    if(i%j==0){
                        isPrime = false ;
                        break;

                    }
                }

                if(isPrime){
                    System.out.println(i);
                }
            }



    }


    public static void main(String [] args){
        PrintPrimeNumbers1ToN ppn = new PrintPrimeNumbers1ToN();
        ppn.printPrimeNumbers1ToN(100);


    }

}
