import java.util.Scanner;
import java.util.Stack;

public class InfixEvalution {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();


        Stack<Integer> opnds = new Stack<>();
        Stack<Character> optors = new Stack<>();

        for(int i = 0 ; i < str.length() ; i++){

            char ch = str.charAt(i);

            if(Character.isDigit(ch)){
                opnds.push(ch - '0');
            }else if (ch == '('){
                optors.push(ch);
            }else if(ch == ')'){

                char optor = optors.pop();
                int v2 = opnds.pop();
                int v1 = opnds.pop();

                int opv = operation(v1 , v2 , optor);

                opnds.push(opv);

            }else if(ch == '+' || ch == '-' || ch == '*' || ch == '/'){

                while(optors.size() > 0 && optors.peek() != '(' && precedence(ch) <= precedence(optors.peek())){
                    char optor = optors.pop();
                    int v2 = opnds.pop();
                    int v1 = opnds.pop();

                    int opv = operation(v1 , v2 , optor);

                    opnds.push(opv);
                }

                optors.push(ch);

            }


        }

        while (optors.size() != 0){
            char optor = optors.pop();
            int v2 = opnds.pop();
            int v1 = opnds.pop();

            int opv = operation(v1 , v2 , optor);

            opnds.push(opv);
        }

        System.out.println(opnds.peek());

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
