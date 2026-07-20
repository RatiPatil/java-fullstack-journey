package Array;

public class FindDuplicateElements {


    int duplicatenumber(int numbers[]) {


        int duplicate = 0;

        for (int i = 0; i <= numbers.length - 1; i++) {



            for (int j = i+1; j <= numbers.length - 1; j++) {

                if (numbers[i] == numbers[j]) {
                    duplicate = numbers[j];
                }

            }


        }

        return duplicate;


    }

    public static void main(String [] args){


        FindDuplicateElements fde = new FindDuplicateElements();

        int numbers[]={1,2,3,4,5,1,};


        int result = fde.duplicatenumber(numbers);

        System.out.println(result);


    }

}
