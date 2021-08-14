import java.util.Locale;

public class NumberEncoding {

    public static void main(String[] args) {

        String str = "1234";

        printEncodings(str , "");
    }

    public static void printEncodings(String str , String asf) {

        if(str.length() == 0){
            System.out.println(asf);
            return;
        }else if(str.length() == 1){
            if(str.charAt(0) == '0'){
                return;
            }else{
                //for 1 char
                String ch0 = str.substring(0,1);
                String ros0 = str.substring(1);
                char code = (char)('a' + (Integer.parseInt(ch0)) - 1);
                printEncodings(ros0 , asf + code);
            }

        }else{

            if(str.charAt(0) == '0'){
                return;
            }else{
                //for 1 char
                String ch0 = str.substring(0,1);
                String ros0 = str.substring(1);
                char code0 = (char)('a' + (Integer.parseInt(ch0)) - 1);
                printEncodings(ros0 , asf + code0);

                //for 12 char
                String ch01 = str.substring(0,2);
                String ros01 = str.substring(2);
                char code01 = (char)('a' + (Integer.parseInt(ch01)) - 1);

                if(Integer.parseInt(ch01) <= 26){
                    printEncodings(ros01 , asf + code01);

                }

            }

        }


    }

}
