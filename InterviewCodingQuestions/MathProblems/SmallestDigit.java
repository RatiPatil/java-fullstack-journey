package MathProblems;

public class SmallestDigit {

    public static void main(String [] args){
        int rem ;
        int smallest = Integer.MAX_VALUE;
        int prev;

        int num = 123456;

        while(num > 0){
            rem=num%10;
            prev = rem;
            num= num/10;

            if(prev<smallest){
                smallest = prev;
            }
        }

        System.out.println(smallest);
    }
}
