package MathProblems;

public class FindLCM {

    public static void main(String [] args){
        int a = 4 ;
        int b = 6;

        int cureentnumber = b;

        while(cureentnumber>0){

            if(cureentnumber%a == 0 && cureentnumber % b == 0){

                System.out.println(cureentnumber);
                break;

            }
            cureentnumber ++ ;

        }
    }
}
