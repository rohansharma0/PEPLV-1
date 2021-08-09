import java.util.Scanner;

public class WaveTraversal {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int[][] arr = new int[n][m];

        for(int i = 0 ; i<n; i++){
            for(int j = 0;j<m ; j++){

                arr[i][j] = sc.nextInt();

            }
        }

        verticalTraversal(arr);
        diagonalTraversal(arr);
    }

    public static void verticalTraversal(int[][] arr){

        for(int j = 0 ; j< arr[0].length ; j++){

            if(j % 2 == 0){

                for(int i = 0 ; i < arr.length ; i++){
                    System.out.println(arr[i][j]);
                }

            }else{

                for(int i = arr.length -1 ; i>=0 ; i--){
                    System.out.println(arr[i][j]);
                }

            }

        }

    }
    public static void diagonalTraversal(int[][] arr){

        for(int gap = 0 ; gap< arr.length ; gap++){

            for(int i = 0, j = gap ; j<arr.length ; i++,j++){

                System.out.println(arr[i][j]);

            }

        }

    }
}
