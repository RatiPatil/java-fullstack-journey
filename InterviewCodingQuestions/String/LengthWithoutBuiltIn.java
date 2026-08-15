package String;

public class LengthWithoutBuiltIn {
    public static void main(String [] args){

        String str = new String("Ratikant");
        int count = 0 ;
        for(int i = 0 ; i<= str.length()-1 ; i++){
            count+=1;
        }

        System.out.println(count);
    }
}
