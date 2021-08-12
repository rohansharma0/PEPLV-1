import java.util.Arrays;
import java.util.Stack;

public class StockSpan {

    public static void main(String[] args) {

        int [] arr = {2,5,9,3,1,12,6,8,7};

        int [] nge = new int[arr.length];

        Stack<Integer> st = new Stack<>();

        st.push(0);

        nge[0] = 1;

        for(int i = 1 ; i< arr.length ; i++){

            //- a +

            while (st.size() > 0 && arr[i] >= arr[st.peek()]){
                st.pop();
            }

            if(st.size() == 0){
                nge[i] = i+1;
            }else{
                nge[i] = i - st.peek();
            }

            st.push(i);

        }

        System.out.println(Arrays.toString(nge));


    }
}
