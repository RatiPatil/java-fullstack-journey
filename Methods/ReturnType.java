
class ReturnType{

   boolean isEven(int n){

       if(n %2==0){
           return true;
       }
       return false;
   }

    public static void main(String [] args){


        ReturnType rt = new ReturnType();

        boolean result = rt.isEven(4);

        System.out.println(result);



    }



}