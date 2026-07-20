package Patterns;

public class Alphabet_Half_Pyramid {
    public static void main(String [] args){

        for(int i = 1; i<=5;i++){
            char letter = 'A' ;

            for(int j = 1 ; j<=i;j++){
                System.out.print(letter);
                letter++;
            }
            System.out.println(" ");
        }
    }

}
