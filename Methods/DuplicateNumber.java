import java.util.*;

public class DuplicateNumber {
    public static void main(String [] data){
        int [] numbers = {1,2,3,4,5,6,7,5};

        for(int i = 0 ; i < numbers.length ; i++){
            // Start j at i + 1 to avoid comparing a number with itself
            for(int j = i + 1 ; j < numbers.length; j++){
                if(numbers[i] == numbers[j]){
                    System.out.println("Duplicate found: " + numbers[i]);
                    break;
                }
            }
        }
    }
}
