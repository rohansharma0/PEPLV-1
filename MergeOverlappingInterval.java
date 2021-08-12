import java.util.Arrays;
import java.util.Stack;

public class MergeOverlappingInterval {


    public static void mergeOverlappingIntervals(int[][] arr) {

        Pair[] pairs = new Pair[arr.length];

        for(int i = 0 ; i< arr.length ; i++){

            pairs[i] = new Pair(arr[i][0] , arr[i][1]);
        }

        Arrays.sort(pairs);

        Stack<Pair> st = new Stack<>();

        for(int i = 0 ; i<pairs.length ; i++){

            if(i == 0){
                st.push(pairs[i]);
            }else {

                Pair top = st.peek();

                if(pairs[i].st <= top.et){
                    top.et = Math.max(top.et , pairs[i].et);
                }else{
                    st.push(pairs[i]);
                }


            }

        }

        //for printing
        while(st.size() > 0){
            Pair top = st.pop();

            System.out.println(top.st + " " + top.et);
        }

    }


}

class Pair implements Comparable<Pair> {
    int st;
    int et;

    Pair(int st , int et){
        this.st = st;
        this.et = et;
    }

    // this > other --> +ve
    // this == other ---> 0
    //this < other --> -ve

    @Override
    public int compareTo(Pair o) {
        if(this.st != o.st){
            return this.st - o.st;
        }else{
            return this.et - o.et;
        }
    }
}