import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args) {

        int arr[] = {64, 34, 25, 12, 22, 11, 90};

        int n = arr.length;

        bubbleSort(arr);

        System.out.println(Arrays.toString(arr));
    }

    public static void bubbleSort(int[] arr){

        for(int i = 0 ; i < arr.length ; i++){

            for(int j = i + 1 ; j < arr.length ; j++){

                if(arr[i] > arr[j]){

                    //swap
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;

                }
            }

        }

    }
}
