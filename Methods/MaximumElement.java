public class MaximumElement {


    int maximumelement(int elements[]){

        int maxelement = elements[0];
        for(int i = 0 ; i<= elements.length-1 ; i++){

            if(elements[i]>maxelement){
                maxelement = elements[i];
            }

        }

        return maxelement;









    }


    public static void main(String [] args){
        int elements[] = {12,34,56,78,89,76};

        MaximumElement me = new MaximumElement();

        int result = me.maximumelement(elements);

        System.out.println(result);
    }
}
