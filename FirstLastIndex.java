public class FirstLastIndex {

    public static void main(String[] args) {
        int[] arr = {1,5,10,15,22,33,33,33,33,33,40,42,55,66,77};

        int tar = 33;

        int i = 0;
        int j = arr.length -1;

        int fi = -1;
        int li = -1;

        while(i < j){

            int mid = (i+j) /2;

            if(tar > arr[mid]){
                i = mid +1;
            }else if(tar < arr[mid]){
                j = mid -1;
            }else{
                fi = mid;
                j = mid - 1;
            }
        }

        i = 0;
        j = arr.length-1;

        while(i < j){

            int mid = (i+j) /2;

            if(tar > arr[mid]){
                i = mid +1;
            }else if(tar < arr[mid]){
                j = mid -1;
            }else{
                li = mid;
                i = mid + 1;
            }
        }

        System.out.println("First Index - " + fi);
        System.out.println("Last Index - " + li);
    }

}
