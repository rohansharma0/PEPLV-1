import java.sql.Array;
import java.util.Arrays;

public class CountSort {

    public static void main(String[] args) {

        int arr[] =  { 4, 2, 2, 8, 3, 3, 1 };

        int min = 1 ;

        int max = 8;

        countSort(arr , min , max);

        System.out.println(Arrays.toString(arr));

    }

    public static void countSort(int[] arr , int min , int max){


        int[] farr = new int[max - min +1];

        int[] res = new int[arr.length];

        //frequency table
        for(int i = 0 ; i<arr.length ; i++){

            farr[arr[i] - min]++;

        }

        //cumulative frequency
        for(int i = 1 ; i< farr.length ; i++){
            farr[i] += farr[i -1];
        }


        for(int i = arr.length -1 ; i>= 0 ; i--){

            int val = arr[i];
            int pos = farr[val - min];
            int idx = pos -1;
            res[idx] = val;
            farr[val - min]--;

        }

        //copy all element to arr

        for(int i = 0 ; i< res.length ; i++){
            arr[i] = res[i];
        }


    }
}
