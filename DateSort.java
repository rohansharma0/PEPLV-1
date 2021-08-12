public class DateSort {

    public static void dateSort(String[] arr){

        countSort(arr , 1000000 , 100,32); // days
        countSort(arr , 10000 ,100,13); // months
        countSort(arr , 1 , 10000,2501); // years
    }

    public static void countSort(String[] arr , int div , int mod , int range){

        int[] farr = new int[range];

        String[] res = new String[arr.length];

        //frequency
        for(int i = 0 ; i <arr.length ; i++){

            farr[Integer.parseInt(arr[i], 10) / div % mod]++;

        }
        //cumulative frequency

        for(int i = 1 ; i<farr.length ; i++){

            farr[i] +=farr[i-1];

        }

        for(int i = arr.length -1 ; i>= 0; i--){

            int pos = farr[Integer.parseInt(arr[i], 10) / div % mod];
            int idx = pos -1;

            res[idx] = arr[i];

            farr[Integer.parseInt(arr[i], 10) / div % mod]--;

        }

        //copy
        for(int i = 0 ; i<arr.length ; i++){
            arr[i] = res[i];
        }
    }
}
