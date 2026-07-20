public class Palindrom {

    public void palindromnumber(){

            int rev = 0;

        int number = 121;

        int temp = number;

        while(number>0){
            int lastdigit = number%10;
            rev=rev*10+lastdigit;

            number = number/10;




        }

        if(temp==rev){
            System.out.println("This is a Palindrom Number : " + temp);
        }else{
            System.out.println("This is not a  Palindrom Number : " + temp);

        }



    }

    public static void main(String []args){

        Palindrom pn = new Palindrom();

        pn.palindromnumber();

    }


}
