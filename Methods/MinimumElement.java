public class MinimumElement {


    int minimumelement(int elements[]){

        if(elements == null || elements.length == 0){
            throw new IllegalArgumentException("Arry must be an elements ...");
        }


        int min = elements[0];

        for(int i = 1 ; i<elements.length ; i++){

            if(elements[i]<min){
                min = elements[i];
            }

        }

        return min;

    }

    public static void main(String []args){
        int elements[] = {12,34,56,33,21,54,56,43};

        MinimumElement me = new MinimumElement();

        int result = me.minimumelement(elements);
        System.out.println(result);
    }
}
