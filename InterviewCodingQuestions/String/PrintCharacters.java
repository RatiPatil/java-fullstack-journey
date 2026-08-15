package String;

public class PrintCharacters {
    public static void main(String [] args){
        String name = "Patil";

        for(int i = 0 ; i<name.length(); i++){
            char ch = name.charAt(i);
            System.out.println(ch);
        }
    }
}
