import java.util.ArrayList;

public class GetStairsPath {

    public static void main(String[] args) {

        int n = 3;


        ArrayList<String> res = getStairPaths(n);

        System.out.println(res);

        printStairPaths(n , "");

    }


    public static ArrayList<String> getStairPaths(int n) {

        if(n == 0){
            ArrayList<String> bs = new ArrayList<>();
            bs.add("");
            return bs;
        }else if(n < 0){
            ArrayList<String> bs = new ArrayList<>();
            return bs;
        }


        ArrayList<String> s1 = getStairPaths(n-1);
        ArrayList<String> s2 = getStairPaths(n-2);
        ArrayList<String> s3 = getStairPaths(n-3);

        ArrayList<String> res = new ArrayList<>();

        for (String e1 : s1){
            res.add(1 + e1);
        }
        for (String e2 : s2){
            res.add(2 + e2);
        }
        for (String e3 : s3){
            res.add(3 + e3);
        }

        return res;
    }

    public static void printStairPaths(int n, String path) {

        if(n == 0){
            System.out.println(path);
            return;
        }else if(n < 0){
            return;
        }

        printStairPaths(n-1 , path + 1);
        printStairPaths(n-2 , path + 2);
        printStairPaths(n-3 , path + 3);



    }


}
