import java.util.ArrayList;

public class GetMazePaths {

    public static void main(String[] args) {

        ArrayList<String> res = getMazePaths(1 , 1 , 3,3);

        System.out.println(res);

        printMazePaths(1 ,1, 3 ,3 , "");

    }


    public static ArrayList<String> getMazePaths(int sr, int sc, int dr, int dc) {


        if(sr == dr &&  sc == dc){
            ArrayList<String> base = new ArrayList<>();
            base.add("");
            return base;
        }


        ArrayList<String> hpaths = new ArrayList<>();
        ArrayList<String> vpaths = new ArrayList<>();

        if(sc < dc){
            hpaths = getMazePaths(sr , sc + 1, dr , dc);
        }
        if(sr < dr){
            vpaths = getMazePaths(sr + 1 , sc, dr , dc);
        }


        ArrayList<String> res = new ArrayList<>();

        for(String hpath : hpaths){
            res.add("h"+hpath);
        }

        for(String vpath : vpaths){
            res.add("v"+vpath);
        }


        return res;

    }

    public static void printMazePaths(int sr, int sc, int dr, int dc, String psf) {

        if(sr == dr &&  sc == dc){
            System.out.println(psf);
            return;
        }

        if(sc < dc){
            printMazePaths(sr , sc + 1, dr , dc , psf + "h");
        }
        if(sr < dr){
            printMazePaths(sr + 1 , sc, dr , dc , psf + "v");
        }

    }


}
