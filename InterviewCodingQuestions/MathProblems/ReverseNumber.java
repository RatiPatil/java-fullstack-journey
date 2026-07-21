package MathProblems;

public class ReverseNumber {

    public int reversenumber(int number) {

        int rem = 0 ;
        int rev = 0;
        //int temp = number;

        while (number > 0) {

            rem = number % 10;
            rev = rev * 10 + rem;
            number = number / 10;

        }


        return rev;
    }

    public static void main(String [] args){
        ReverseNumber rsn = new ReverseNumber();


        int result = rsn.reversenumber(1234);
        System.out.println(result);
    }
}
