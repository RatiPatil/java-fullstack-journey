package Array;

public class Array2D {


    public static void main(String [] args){
       // int marks [][] = new int [3][3];
        int marksd [][] = {
                {1,2},
                {2,4,75,4,3},
                {5,6,7,8,9,9,9},
                {3}

        };

        for(int i = 0; i<=marksd.length-1; i++){
            int collength = marksd[i].length;
            for(int j = 0 ; j<collength; j++){
                System.out.print(marksd[i][j]+" ");
            }
            System.out.println("");
        }

    }
}
