import java.util.Scanner;

public class ShellRotate {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] arr = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        int s = sc.nextInt();
        int r = sc.nextInt();
        rotateShell(arr, s, r);
    }

    public static void rotateShell(int[][] arr , int s , int r){

        int[] oned = fillOnedFromShell(arr , s);
        rotate(oned, r);
        fillShellFromOned(arr , s , oned);

    }

    public static int[] fillOnedFromShell(int [][] arr , int s){
        int minr = s-1;
        int minc = s-1;
        int maxr = arr.length - s;
        int maxc = arr[0].length - s ;

        int sz = 2 * (maxr - minr + maxc - minc);

        int[] oned = new int[sz];

        int idx = 0;
        //lw

        for(int i = minr , j = minc ; i<=maxr ; i++){
            oned[idx] = arr[i][j];
            idx++;
        }

        //bw

        for(int i = maxr , j = minc+1 ; j<=maxc ; j++){
            oned[idx] = arr[i][j];
            idx++;
        }

        //rw

        for(int i = maxr -1 , j = maxc ; i >= minr ; i--){
            oned[idx] = arr[i][j];
            idx++;
        }

        //tw

        for(int i = minr , j = maxc -1 ; j>= minc+1 ; j--){
            oned[idx] = arr[i][j];
            idx++;
        }

        return oned;


    }
    public static void fillShellFromOned(int[][] arr , int s , int[] oned){

        int minr = s-1;
        int minc = s-1;
        int maxr = arr.length - s;
        int maxc = arr[0].length - s ;


        int idx = 0;
        //lw

        for(int i = minr , j = minc ; i<=maxr ; i++){
            arr[i][j] =  oned[idx];
            idx++;
        }

        //bw

        for(int i = maxr , j = minc+1 ; j<=maxc ; j++){
            arr[i][j] =  oned[idx];
            idx++;
        }

        //rw

        for(int i = maxr -1 , j = maxc ; i >= minr ; i--){
            arr[i][j] =  oned[idx];
            idx++;
        }

        //tw

        for(int i = minr , j = maxc -1 ; j>= minc+1 ; j--){
            arr[i][j] =  oned[idx];
            idx++;
        }
    }

    public static void rotate(int[] oned , int r){

        r = r % oned.length;
        if(r < 0){
            r = r + oned.length;
        }

        reverse(oned ,0, oned.length - r -1);
        reverse(oned ,oned.length - r,oned.length -1 );
        reverse(oned ,0, oned.length -1);

    }

    public static void reverse(int[] oned , int li , int ri){
        while(li < ri){
            int temp = oned[li];
            oned[li] = oned[ri];
            oned[ri] = temp;
            li++;
            ri--;
        }
    }

}
