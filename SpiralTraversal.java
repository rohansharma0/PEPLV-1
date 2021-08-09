import java.util.Scanner;

public class SpiralTraversal {

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

        spiralTraversal(arr);

    }

    public static void spiralTraversal(int[][] arr){

        int n = arr.length;
        int m = arr[0].length;

        int minr = 0;
        int minc = 0;
        int maxr = n -1;
        int maxc = m -1;

        int tne = n * m;

        int c = 0;

        while(c < tne){

            //left wall;
            for(int i = minr , j = minc ; i<=maxr && c < tne; i++){

                System.out.println(arr[i][j]);
                c++;

            }
            minc++;

            //bottom wall
            for(int i = maxr , j = minc ; j<=maxc && c < tne ; j++){

                System.out.println(arr[i][j]);
                c++;

            }
            maxr--;

            //right wall
            for(int i = maxr , j = maxc ; i>=minr && c < tne ; i--){

                System.out.println(arr[i][j]);
                c++;
            }
            maxc--;

            //top wall
            for(int i = minr , j = maxc ; j>=minc && c < tne ; j--){

                System.out.println(arr[i][j]);
                c++;
            }
            minr++;

        }

    }
}
