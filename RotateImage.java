import java.util.Scanner;

public class RotateImage {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[][] arr = new int[n][n];

        for(int i = 0 ; i<n; i++){
            for(int j = 0;j<n ; j++){

                arr[i][j] = sc.nextInt();

            }
        }

        //transpose

        for(int i = 0 ; i< n; i++){
            for(int j = i ; j< n ; j++){
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }

        //reverse column

        for(int i = 0 ; i<n ; i++){
            int li = 0;
            int ri = n -1;
            while(li < ri){
                int temp = arr[i][li];
                arr[i][li] = arr[i][ri];
                arr[i][ri] = temp;

                li++;
                ri--;
            }
        }

    }
}
