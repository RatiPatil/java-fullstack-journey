public class CountDivisors {
    public static void  main (String [] args){

        int number = 12 ;
        int count = 0 ;
        for(int i = 1 ; i<= number ; i++){
            if(number % i  == 0 ){
                count+=1;
            }
        }

        System.out.println(count);


    }
}
