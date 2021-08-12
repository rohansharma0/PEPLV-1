import java.util.Arrays;

public class InsertionSort {

    public static void main(String[] args) {

        int arr[] = {64, 34, 25, 12, 22, 11, 90};

        int n = arr.length;

        insertionSort(arr);

        System.out.println(Arrays.toString(arr));

    }

    public static void insertionSort(int[] arr){

        for(int i = 1 ; i < arr.length ; i++){

            for(int j = i - 1; j>= 0 ; j--){

                if(arr[j] > arr[j+1]){

                    //swap
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;

                }else{
                    break;
                }

            }

        }

    }

}
