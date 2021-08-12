import java.util.Arrays;

public class Sort012 {

    public static void main(String[] args) {

        int [] arr= {1,0,2 ,2 ,1,0};

        sortO12(arr);

        System.out.println(Arrays.toString(arr));

    }

    public static void sortO12(int[] arr){

        int i = 0;
        int j = 0;

        int k = arr.length-1;

        while(i <= k){

            if(arr[i] == 1){
                i++;
            }else if(arr[i] == 2){
                // swap i and k
                int temp = arr[i];
                arr[i] = arr[k];
                arr[k] = temp;

                k--;

            }else{
                //swap i and j
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;


                i++;
                j++;
            }

        }

    }
}
