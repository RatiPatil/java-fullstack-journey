package String;

public class StringLength {
    public int lengthfind(String name ){
        String str  = name ;


        char[] arr = name.toCharArray();
        int count = 0 ;

        for(int i = 0 ; i<=arr.length-1; i++){
            count+=1;



        }

        return count ;
    }


    public static void main(String [] args){

        StringLength sl = new StringLength();

        System.out.println(sl.lengthfind("Ratikant"));

    }
}


