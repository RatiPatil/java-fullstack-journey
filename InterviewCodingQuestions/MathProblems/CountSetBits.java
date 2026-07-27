package MathProblems;

public class CountSetBits {
    public static void main(String [] args){
        int number = 13 ;
        int count = 0 ;


        while(number>0){

            if (number%2==1){
                count+=1;
            }
            number = number /2 ;

        }

        System.out.println(count);
    }
}
