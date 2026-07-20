package Array;

public interface CountEvenOddNumbers {

    static  String evenoddnumber  (int number){


        if(number%2==0){
            return "even";
        }else{
            return "odd";
        }




    }

    public static void main(String [] args){

        System.out.println(evenoddnumber(90));
        System.out.println(evenoddnumber(39));



    }



}
