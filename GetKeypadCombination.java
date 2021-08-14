import java.util.ArrayList;

public class GetKeypadCombination {


    public static void main(String[] args) {

        String str= "78";

        ArrayList<String> words = getKPC(str);

        System.out.println(words);

        printKPC(str , "");

    }
    static String[] code = {".;","abc","def","ghi","jkl", "mno" , "pqrs" , "tu" , "vwx" , "yz"};


    public static ArrayList<String> getKPC(String str) {

        if(str.length() == 0){
            ArrayList<String> bs = new ArrayList<>();
            bs.add("");
            return bs;
        }

        char ch = str.charAt(0);

        String ros = str.substring(1);

        ArrayList<String> rres = getKPC(ros);

        ArrayList<String> res = new ArrayList<>();

        String codes = code[ch - '0'];

        for(int i = 0 ; i<codes.length() ; i++){

            char c = codes.charAt(i);
            for(String s : rres){

                res.add(c + s);
            }

        }

        return res;
    }

    public static void printKPC(String str, String asf) {

        if(str.length() == 0){
            System.out.println(asf);
            return;
        }

        char ch = str.charAt(0);

        String ros = str.substring(1);

        String codes = code[ch - '0'];

        for(int i = 0 ; i<codes.length() ; i++){

            char c = codes.charAt(i);

            printKPC(ros ,  asf + c);

        }

    }

}
