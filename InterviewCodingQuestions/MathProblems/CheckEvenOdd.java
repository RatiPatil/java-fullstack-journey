package MathProblems;

public class CheckEvenOdd {

    public String checkevenorodd(int num){

        if(num%2==0){
            return "even";
        }else{
            return "odd";
        }
    }


    public static void main(String [] args){
        CheckEvenOdd ceo = new CheckEvenOdd();
        String result = ceo.checkevenorodd(-6);
        System.out.println(result);
    }
}
