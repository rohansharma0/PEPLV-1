import java.util.Arrays;

public class Sort01 {

    public static void main(String[] args) {

        int [] arr= {0,1,0,1,0};

        sortO1(arr);

        System.out.println(Arrays.toString(arr));

    }

    public static void sortO1(int[] arr){

        int i = 0;
        int j = 0;

        while(i < arr.length){

            if(arr[i] == 1){
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

    }

}
