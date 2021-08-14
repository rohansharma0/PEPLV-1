import java.util.ArrayList;
public class GetSubsequence {

    public static void main(String[] args) {

        String str = "abc";

        ArrayList<String> res = getss(str);

        System.out.println(res);

        printss(str , "");

    }

    public static ArrayList<String> getss(String str) {

        if(str.length() == 0){
            ArrayList<String> bs = new ArrayList<>();
            bs.add("");
            return bs;
        }


        ArrayList<String> res = new ArrayList<>();

        char ch = str.charAt(0); // a

        String ros = str.substring(1); // bc

        ArrayList<String > rres = getss(ros); // [--,-c,b-,bc ]

        for(String s : rres){

            res.add("" + s);
            res.add(ch + s);
        }

        return res;

    }

    public static void printss(String str , String ans){

        if(str.length() == 0){
            System.out.println(ans);
            return;
        }

        char ch = str.charAt(0);

        String ros = str.substring(1);

        printss(ros , ans + "");
        printss(ros , ans + ch);

    }

}
