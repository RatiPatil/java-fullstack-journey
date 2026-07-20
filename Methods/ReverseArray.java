import java.util.ArrayList;

public class ReverseArray {


    void reverarr(int array[]){

        ArrayList<Integer> arrylist = new ArrayList<>();

        for(int  i = array.length-1 ; i>=0 ; i--){

            arrylist.add(array[i]);



        }

        System.out.print(arrylist);
    }


    public static void main(String [] args){

        int array[] = {12,34,56,21,34,12};

        ReverseArray revar = new ReverseArray();

        revar . reverarr(array);


    }
}
