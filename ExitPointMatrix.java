import java.util.Scanner;

public class ExitPointMatrix {

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

        int i = 0;
        int j = 0;

        int dir = 0;

        while(true){

            dir = (dir + arr[i][j]) % 4;

            if(dir == 0){ // east
                j++;
            }else if(dir == 1){ // south
                i++;
            }else if(dir == 2){ // wast
                j--;
            }else if(dir == 3){ // north
                i--;
            }

            if(i < 0){
                i++;
                break;
            }else if(j < 0){
                j++;
                break;

            }else if(i== n){
                i--;
                break;

            }else if(j== m){
                j--;
                break;
            }
        }

        System.out.println(i);
        System.out.println(j);


    }

}
