package BasicProblems;
import java.util.*;


class Number{

    public static int  checkNumberSign(int num){

        return num;

    }



}
public class CheckNumberSign {

    public static void main(String [] args){
        Number no = new Number();
        Scanner sc = new Scanner(System.in);
        int numberr = sc.nextInt();
        int result = no.checkNumberSign(numberr);
        if(result>0){
            System.out.println("The positive number is : "+result);
        }else if(result<0){
            System.out.println("The negative Number is : "+result);
        } else if (result==0){
            {
            System.out.println("The number is zero  :"+result);
            }
        }

    }
}
