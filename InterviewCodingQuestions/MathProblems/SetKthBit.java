package MathProblems;

public class SetKthBit {

    public static void main(String[] args) {

        int number = 10;
        int k = 2;

        int result = number | (1 << k);

        System.out.println("Original Number : " + number);
        System.out.println("After Setting Bit : " + result);
    }
}