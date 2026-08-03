package String;

public class PrintEachCharacter {
    public static void main (String [] args){
        String str  = "Ratikant" ;

        for(int i = 0 ; i<str.length(); i++){
            char ch = str.charAt(i);
            System.out.println(ch);
        }
    }


}
