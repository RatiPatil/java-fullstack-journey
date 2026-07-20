package Array;//package Array;
//
//public class SumofArrayElements {
//
//    int sumofallelements(int array[]){
//        int sum = 0;
//
//        for(int i = 0 ; i<= array.length-1; i++){
//
//            sum = sum+array[i];
//
//
//
//        }
//
//        return sum;
//
//
//
//    }
//
//
//    public static void main(String [] args){
//
//        SumofArrayElements sae = new SumofArrayElements();
//
//        int array[]= {12,34,55,78,12};
//
//
//        int result = sae.sumofallelements(array);
//
//        System.out.println(result);
//
//
//    }
//
//
//}



class  SumofArrayElements{

    int duplicate(int  number[]){
        int duplicatte=0;
        for (int i = 0 ; i<=number.length-1; i++ ){

            for(int j = i+1 ; j<=number.length-1; j++){
                if(number[i]==number[j]){
                    duplicatte = number[j];
                }
            }

        }

        return duplicatte;



    }

    public static void main(String [] args){


        int number[] = {1,2,3,4,5,2};

        SumofArrayElements sae = new SumofArrayElements();

        int result = sae.duplicate(number);

        System.out.println(result);


    }




}
