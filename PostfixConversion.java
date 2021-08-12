
import java.util.Stack;

public class PostfixConversion {

    public static void main(String[] args) {

        String str = "264*8/+3-";


        Stack<String> pre = new Stack<>();
        Stack<String> in = new Stack<>();

        Stack<Integer> opnds = new Stack<>();

        for(int i = 0 ; i<str.length() ; i++){

            char ch = str.charAt(i);


            if(Character.isDigit(ch)){
                opnds.push(ch - '0');
                in.push(ch+"");
                pre.push(ch+"");
            }else if(ch == '+' ||
                    ch == '-' ||
                    ch == '*' ||
                    ch == '/'){

                int v2 = opnds.pop();
                int v1 = opnds.pop();

                int v = operation(v1 ,v2 , ch);

                opnds.push(v);

                String inv2 = in.pop();
                String inv1 = in.pop();

                String inv = "(" + inv1 + ch + inv2 + ")";

                in.push(inv);

                String prev2 = pre.pop();
                String prev1 = pre.pop();

                String prev =   ch + prev1  + prev2;

                pre.push(prev);


            }

        }


        System.out.println(opnds.peek());
        System.out.println(in.peek());
        System.out.println(pre.peek());


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
