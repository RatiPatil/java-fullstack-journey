package MathProblems;

public class ClearKthBit {

    public static void main(String[] args) {

        int number = 14;
        int k = 2;

        int result = number & ~(1 << k);

        System.out.println("Original Number : " + number);
        System.out.println("After Clearing Bit : " + result);
    }
}