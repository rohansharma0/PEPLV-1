import java.util.Arrays;

public class QuickSelect {

    public static void main(String[] args) {

        int arr[] = {3, 2, 3, 1, 2, 4, 5,5,6};

        //place smallest element
        int k = 4;

        // index = 4 -1 ;
        int i = arr.length - 4;
        System.out.println(quickSelect(arr , 0 , arr.length -1 , i));


    }

    public static int quickSelect(int[] arr, int lo, int hi, int k) {

        int p = partition(arr , arr[hi] , lo  , hi);

        if(p == k){
            return arr[k];
        }else if(p > k){

            return quickSelect(arr , lo , p- 1 , k);

        }else{
            return quickSelect(arr , p +1 , hi , k);
        }


    }

    public static int partition(int[] arr, int pivot, int lo, int hi) {

        int i = lo;
        int j = lo;

        while(i <= hi){

            if(arr[i] > pivot){
                i++;
            }else {
                //swap;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;

                i++;
                j++;

            }

        }

        return j -1;

    }
}
