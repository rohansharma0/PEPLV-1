import java.util.Arrays;

public class SelectionSort {

    public static void main(String[] args) {
        int arr[] = {64, 34, 25, 12, 22, 11, 90};

        int n = arr.length;

        selectionSort(arr);

        System.out.println(Arrays.toString(arr));
    }

    public static void selectionSort(int[] arr){

        for(int i = 0 ; i<arr.length ; i++){

            int min = i;

            for(int j = i+1 ; j<arr.length ; j++){
                if(arr[min] > arr[j]){
                    min = j;
                }
            }
            //swap
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;

        }

    }
}
