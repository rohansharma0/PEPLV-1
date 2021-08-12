import java.util.Arrays;

public class MergeSort {

    public static void main(String[] args) {

        int arr[] = {64, 34, 25, 12, 22, 11, 90};

        int[] res = mergeSort(arr , 0 , arr.length-1);

        System.out.println(Arrays.toString(res));

    }

    public static int[] mergeSort(int arr[] , int low , int high){

        if(high == low){
            int[] bs = new int[1];
            bs[0] = arr[high];
            return bs;
        }


        int mid = (high + low) / 2;

        int[] a = mergeSort(arr , low , mid);
        int[] b = mergeSort(arr , mid + 1 , high);

        int res[] = merge(a , b);

        return res;

    }
    public static int[] merge(int[] arr1 , int[] arr2){

        int[] res = new int[arr1.length + arr2.length];

        int i = 0;
        int j = 0;
        int k = 0;

        while(i < arr1.length && j < arr2.length ){

            if(arr1[i] >= arr2[j]){
                res[k++] = arr2[j++];
            }else{
                res[k++] = arr1[i++];
            }

        }

        while (i < arr1.length){
            res[k++] = arr1[i++];
        }
        while (j < arr2.length){
            res[k++] = arr2[j++];
        }

        return res;

    }



}
