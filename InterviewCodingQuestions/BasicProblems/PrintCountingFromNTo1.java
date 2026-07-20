package BasicProblems;

public class PrintCountingFromNTo1 {
    public void printCountingFromNTo1(int number){
        for(int i = number; i>0; i--){
            System.out.println(i);
        }
    }

    public static void main(String [] args){
        PrintCountingFromNTo1 pcfn = new PrintCountingFromNTo1();

        pcfn.printCountingFromNTo1(10);
    }
}
