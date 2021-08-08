import java.util.Arrays;

public class MatrixMultiplication {

    public static void main(String[] args) {

        int[][] arr1 = { { 1, 1, 1 },
                { 2, 2, 2 },
                { 3, 3, 3 },
                { 4, 4, 4 } };

        int r1 = arr1.length;
        int c1 = arr1[0].length;

        int[][] arr2 = { { 1, 1, 1, 1 },
                { 2, 2, 2, 2 },
                { 3, 3, 3, 3 } };

        int r2 = arr2.length;
        int c2 = arr2[0].length;


        multiplyMatrix(arr1 , arr2 , r1 , c1 , r2 , c2);
    }

    public static void multiplyMatrix(int[][] arr1 , int[][]arr2 , int r1 , int c1 , int r2 , int c2){

        if (r2 != c1){

            System.out.println("Multiplication Not Possible");
            return;
        }

        int[][] res = new int[r1][c2];

        for(int i = 0 ; i< r1 ; i++){
            for(int j = 0 ; j < c2 ; j++){

                for(int k = 0 ; k < r2 ; k++){
                    res[i][j] += arr1[i][k] * arr2[k][j];
                }

            }
        }

        for (int[] re : res) {
            System.out.println(Arrays.toString(re));
        }

    }

}
