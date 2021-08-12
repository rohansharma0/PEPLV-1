public class PivotSortedRotatedArray {

    public static int findPivot(int[] arr) {

        int i = 0;
        int j = arr.length -1;

        while (i < j){

            int mid = (i+j) /2 ;
            if(arr[mid] < arr[j]){
                j = mid;
            }else{
                i = mid + 1;
            }

        }

        return arr[i];

    }

}
