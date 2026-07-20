public class Factorial {

    static int  fact(int n){
        int fact = 1;

        for(int i = 1 ; i<=n ;i++){

            fact = fact*i;



        }
        return fact;




    }

    public static void main(String [] args){

        int result = fact(5);

        System.out.println(result);



    }



}
