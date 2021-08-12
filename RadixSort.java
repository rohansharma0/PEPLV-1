public class RadixSort {

    public static void main(String[] args) {

    }

    public static void radixSort(int[] arr){

        int max = Integer.MIN_VALUE;
        for(int val : arr){
            if(val > max){
                max = val;
            }
        }

        int exp = 1;
        while(exp <= max){
            countSort(arr , exp);
            exp *= 10;
        }
    }

    public static void countSort(int[] arr , int exp){

        int[] farr = new int[10];

        int[] res = new int[arr.length];

        //frequency
        for(int i = 0 ; i <arr.length ; i++){

            farr[arr[i] / exp % 10]++;

        }
        //cumulative frequency

        for(int i = 1 ; i<farr.length ; i++){

            farr[i] +=farr[i-1];

        }

        for(int i = arr.length -1 ; i>= 0; i--){

            int pos = farr[arr[i] / exp % 10];
            int idx = pos -1;

            res[idx] = arr[i];

            farr[arr[i] / exp % 10]--;

        }

        //copy
        for(int i = 0 ; i<arr.length ; i++){
            arr[i] = res[i];
        }
    }

}
