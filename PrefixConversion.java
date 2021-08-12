
import java.util.Stack;

public class PrefixConversion {

    public static void main(String[] args) {

        String str = "-+2/*6483";


        Stack<String> post = new Stack<>();
        Stack<String> in = new Stack<>();

        Stack<Integer> opnds = new Stack<>();

        for(int i = str.length() -1 ; i>= 0; i--){

            char ch = str.charAt(i);


            if(Character.isDigit(ch)){
                opnds.push(ch - '0');
                in.push(ch+"");
                post.push(ch+"");
            }else if(ch == '+' ||
                    ch == '-' ||
                    ch == '*' ||
                    ch == '/'){

                int v1 = opnds.pop();
                int v2 = opnds.pop();

                int v = operation(v1 ,v2 , ch);

                opnds.push(v);

                String inv1 = in.pop();
                String inv2 = in.pop();

                String inv = "(" + inv1 + ch + inv2 + ")";

                in.push(inv);

                String postv1 = post.pop();
                String postv2 = post.pop();

                String prev =   postv1  + postv2 + ch;

                post.push(prev);


            }

        }


        System.out.println(opnds.peek());
        System.out.println(in.peek());
        System.out.println(post.peek());


    }

    public static int operation(int v1 , int v2 , char ch){

        if(ch == '+'){
            return v1 + v2;
        }else if(ch == '-'){
            return v1 - v2;
        }else if(ch == '*'){
            return v1 * v2;
        }else{
            return v1 / v2;
        }
    }
}
