package String;

public class ReverseString {
    public static void main(String [] args){
        String str =  "Ratikant Patil";

        String full = str.trim();
        String reversed = "";

        for(int i = full.length()-1 ;i>=0;  i--){

            reversed = reversed+full.charAt(i);



        }

        System.out.println(reversed);
    }
}
