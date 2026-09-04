package Practice;




public class FactorialUsingRecursion {

    public int factorialUsingRecursion (int n){
        if(n==1 || n==0){
            return 1;
        }else{

            return n * factorialUsingRecursion(n-1);
        }
    }

    public static void main(String []  data ){
        int number = 5 ;

        FactorialUsingRecursion  fc = new FactorialUsingRecursion();

        int result = fc.factorialUsingRecursion(number);

        System.out.println("The factorial of Number " + number + "is " + result );
    }

}
