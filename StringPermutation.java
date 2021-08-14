public class StringPermutation {

    public static void main(String[] args) {

        String str = "abc";

        printPermutations(str , "");

    }


    public static void printPermutations(String str, String asf) {

        if(str.length() == 0){
            System.out.println(asf);
            return;
        }

        for(int i = 0 ; i<str.length() ; i++){

            char ch = str.charAt(i);

            String ros = str.substring(0 , i)+str.substring(i+1);

            printPermutations(ros , asf + ch);

        }

    }


}
