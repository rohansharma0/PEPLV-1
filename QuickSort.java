import java.util.Arrays;

public class QuickSort {

    public static void main(String[] args) {
        int arr[] = {64, 34, 25, 12, 22, 11, 90};

        quickSort(arr , 0 , arr.length-1);

        System.out.println(Arrays.toString(arr));

    }


    public static void quickSort(int[] arr , int low , int high){

        if(low > high){
            return;
        }

        int p = partition(arr , arr[high] , low , high);

        quickSort(arr , low , p-1);
        quickSort(arr , p+ 1 , high);

    }


    public static int partition(int[] arr , int pivot , int low , int high){

        int i = low;
        int j = low;

        while(i <= high){
            if(arr[i] > pivot){
                i++;
            }else{
                //swap
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
