import java.util.Stack;

public class CelebrityProblem {

    public static void findCelebrity(int[][] arr) {

        Stack<Integer> st = new Stack<>();

        for(int i = 0 ; i< arr.length ; i++){
            st.push(i);
        }

        while(st.size() >= 2){

            int i = st.pop();
            int j = st.pop();

            if(arr[i][j] == 1){
                // i knows j --> i is not
                st.push(j);
            }else{
                // i do not know j --> j is not
                st.push(i);
            }

        }
        int pot = st.pop();

        for(int i = 0 ; i<arr.length ; i++){

            if(i != pot){

                if(arr[i][pot] == 0 || arr[pot][i] == 1){
                    System.out.println("none");
                    return;
                }

            }

        }

        System.out.println(pot);

    }
}
