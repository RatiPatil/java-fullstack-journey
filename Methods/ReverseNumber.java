public class ReverseNumber {


    static int reversenumber(int n){
        int rev = 0;
        while(n>0){
            int lastdigit = n%10;
            rev = rev*10+lastdigit;

            n = n/10;



        }

        return rev ;


    }


    public static void main(String [] args){


        int result = reversenumber(987);
        System.out.println(result);


    }
}
