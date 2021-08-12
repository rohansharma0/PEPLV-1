import java.util.Stack;

public class SmallestNumberFollowingPattern {

    public static void main(String[] args) {

        String str = "ddddiiii";

        Stack<Integer> st = new Stack<>();
        int n = 1;

        for(int i = 0 ; i<str.length() ; i++){

            char ch = str.charAt(i);

            if(ch == 'd'){

                st.push(n++);

            }else if(ch == 'i'){

                st.push(n++);

                while (st.size() > 0){

                    System.out.println(st.pop());

                }


            }

        }
        st.push(n++);
        while (st.size() > 0){

            System.out.println(st.pop());

        }

    }

}
