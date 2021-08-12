import java.util.Stack;

public class LargestAreaHistogram {

    public static void main(String[] args) {

        int[] arr = {7,6,2,5,4,5,1};


        int[] right = new int[arr.length];

        Stack<Integer> st = new Stack<>();

        st.push(arr.length -1);

        right[arr.length - 1] = arr.length;

        for(int i = arr.length - 2 ; i>= 0 ; i-- ){
            // - a +

            while(st.size() > 0 && arr[i] <= arr[st.peek()]){
                st.pop();
            }

            if(st.size() == 0){
                right[i] = arr.length;
            }else{
                right[i] = st.peek();
            }

            st.push(i);
        }

        int[] left = new int[arr.length];

        st = new Stack<>();

        st.push(0);

        left[0] = -1;

        for(int i = 1; i < arr.length ; i++ ){
            // - a +

            while(st.size() > 0 && arr[i] <= arr[st.peek()]){
                st.pop();
            }

            if(st.size() == 0){
                left[i] = -1;
            }else{
                left[i] = st.peek();
            }

            st.push(i);
        }

        int max = Integer.MIN_VALUE;

        for(int i = 0 ; i<left.length ; i++){

            int width = right[i] - left[i] -1;

            int area = width * arr[i];

            if(area > max){
                max = area;
            }

        }

        System.out.println(max);

    }

}
