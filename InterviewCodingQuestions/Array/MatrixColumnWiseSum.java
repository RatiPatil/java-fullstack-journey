package Array;

public class MatrixColumnWiseSum {
    public static void main(String [] args){
        int arr [][] = {{1,2},{3,3},{4,5}};

        int sum = 0 ;

        int i,j;

        for(i = 0 ; i<=arr.length-1; i++){
            for(j = 0 ; j<=arr[i].length-1; j++){

                sum = sum + arr[j][i];

            }

            System.out.print("Colomun No " + j + " " + sum );
            System.out.println(" ");
            sum = 0 ;
        }


    }
}
