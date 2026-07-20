class SecondLargestElement{

    int secondlarge(int array[]){

        int  max = Integer.MIN_VALUE;
        int secondmax = Integer.MIN_VALUE;


        for(int i = 0; i<array.length; i++){

            if(array[i]>max){
                max = array[i];
            }


        }

        for(int i = 0 ; i<array.length; i++){
            if(array[i]>secondmax && array[i]<  max){

                secondmax = array[i];

            }
        }

        return  secondmax;




    }

    public static void main(String [] args){

        SecondLargestElement sle = new SecondLargestElement();


        int array [] = {23,56,77,88,43,23,25};

        int result = sle.secondlarge(array);
        System.out.println(result);


    }





}