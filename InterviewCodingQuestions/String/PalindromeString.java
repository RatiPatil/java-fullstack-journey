package String;

import MathProblems.ReverseInteger;

public class PalindromeString {
    public static void main(String [] args) {

        String str = new String("Rart");
//        String strr = "hello";

        String Reversed = "";
        for (int i = str.length()-1; i >=0; i--) {
            Reversed = Reversed+  str.charAt(i);
        }

        if (str.equalsIgnoreCase( Reversed)) {
            System.out.println("Palindrome");

        }else{
            System.out.println("not Palindrome");
        }


    }
}
