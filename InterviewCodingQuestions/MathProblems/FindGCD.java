package MathProblems;

public class FindGCD {
    public static void main(String[] args){
        int a  = 12;
        int b = 18;

        int currentnumber = a;


        while(currentnumber>0){
            if(a % currentnumber== 0 && b % currentnumber  ==0 ){
                System.out.println(currentnumber);
                break;
            }
            currentnumber--;
        }
    }
}
