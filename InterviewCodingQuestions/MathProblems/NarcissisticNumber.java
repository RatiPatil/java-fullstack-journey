package MathProblems;

public class NarcissisticNumber {
    public static void main(String [] args){
        int number = 158 ;
        double  sum = 0 ;
        int temp = number;
        int digitcount = 0 ;

            while(number > 0){
                digitcount += 1 ;
                number = number / 10 ;
            }
            number  = temp ;

        while(number  > 0){

            int rem = number % 10 ;



             sum = Math.pow(rem , digitcount) + sum ;

            number = number / 10 ;



        }

        if(temp == sum ){
            System.out.println("NarcissisticNumber");
        }else{
            System.out.println("Not NarcissisticNumber");
        }
    }
}
