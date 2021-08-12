import java.util.*;

public class NextGreaterElement {

    public static void main(String[] args) {
        int [] arr = {5,5,3,8,-2,7};

        int [] res = nextGreaterElementRight(arr);

        System.out.println(Arrays.toString(res));
    }

    public static int[] nextGreaterElementRight(int[] arr){

        int[] nge = new int[arr.length];

        Stack<Integer> st = new Stack<>();

        st.push(arr[arr.length-1]);

        nge[arr.length -1] = -1;


        for(int i = arr.length -2 ; i>= 0 ; i--){
            // - a +
            //pop all smaller element till
            while (st.size() > 0 && arr[i] >= st.peek()){
                st.pop();
            }
            //assign
            if(st.size() == 0){
                nge[i] = -1;
            }else{
                nge[i] = st.peek();
            }

            //push
            st.push(arr[i]);

        }
        return nge;

    }
}
