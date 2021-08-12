import java.util.SortedMap;
import java.util.Stack;

public class InfixConversoion {

    public static void main(String[] args) {

        String str = "a*(b-c+d)/e";


        Stack<String> pre = new Stack<>();
        Stack<String> post = new Stack<>();

        Stack<Character> optors = new Stack<>();

        for(int i = 0 ; i<str.length() ; i++){

            char ch = str.charAt(i);

            if(ch == '('){
                optors.push(ch);
            }else if((ch >= '0' && ch <= '9')
                    || (ch >= 'a' && ch <= 'z')
                    || (ch >= 'A' && ch <= 'Z')){

                pre.push(ch+"");
                post.push(ch+"");

            }else if(ch == ')'){

                while (optors.peek() != '('){

                    char optor = optors.pop();

                    String prev2 = pre.pop();
                    String prev1 = pre.pop();

                    String preov =  optor + prev1 + prev2;

                    pre.push(preov);

                    String postv2 = post.pop();
                    String postv1 = post.pop();

                    String postov =   postv1 + postv2 + optor;

                    post.push(postov);
                }
                optors.pop();

            }else if(ch == '+' ||
                    ch == '-' ||
                    ch == '*' ||
                    ch == '/'){

                while (optors.size() > 0 &&
                        optors.peek() != '(' &&
                        precedence(ch) <= precedence(optors.peek())){

                    char optor = optors.pop();

                    String prev2 = pre.pop();
                    String prev1 = pre.pop();

                    String preov =  optor + prev1 + prev2;

                    pre.push(preov);

                    String postv2 = post.pop();
                    String postv1 = post.pop();

                    String postov =   postv1 + postv2 + optor;

                    post.push(postov);
                }
                optors.push(ch);

            }

        }

        while (optors.size() > 0){

            char optor = optors.pop();

            String prev2 = pre.pop();
            String prev1 = pre.pop();

            String preov =  optor + prev1 + prev2;

            pre.push(preov);

            String postv2 = post.pop();
            String postv1 = post.pop();

            String postov =   postv1 + postv2 + optor;

            post.push(postov);
        }

        System.out.println(pre.peek());
        System.out.println(post.peek());

    }
    public static int precedence(char ch) {

        if(ch == '+'){
            return 1;
        }else if(ch == '-'){
            return 1;
        }else if(ch == '*'){
            return 2;
        }else{
            return 2;
        }
    }

}
