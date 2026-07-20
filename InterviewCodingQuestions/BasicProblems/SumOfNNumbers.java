package BasicProblems;

public class SumOfNNumbers {

    int  sumOfNNumbers (int num){
        int sum = 0;

        for(int i = 0 ; i<=num; i++){
            sum = sum+i;

        }
        return  sum ;

    }

    public static void main(String [] args ){
        SumOfNNumbers sfnn = new SumOfNNumbers();

        int result = sfnn.sumOfNNumbers(10);

        System.out.println(result);

    }
}
