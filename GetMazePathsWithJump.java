import java.util.ArrayList;

public class GetMazePathsWithJump {

    public static void main(String[] args) {
        ArrayList<String> res = getMazePaths(1 , 1 , 3,3);

        System.out.println(res);

        printMazePaths(1 ,1, 3 ,3 , "");
    }

    public static ArrayList<String> getMazePaths(int sr, int sc, int dr, int dc) {

        if(sr == dr && sc == dc){
            ArrayList<String> base = new ArrayList<>();
            base.add("");
            return base;
        }

        ArrayList<String> paths = new ArrayList<>();

        for(int ms = 1 ; ms <= dc-sc ; ms++){
            ArrayList<String> hpaths = getMazePaths(sr  , sc+ ms, dr , dc);
            for(String hpath : hpaths){
                paths.add("h" + ms + hpath);
            }
        }

        for(int ms = 1 ; ms <= dr-sr ; ms++){
            ArrayList<String> vpaths = getMazePaths(sr+ ms , sc , dr , dc);
            for(String vpath : vpaths){
                paths.add("v" + ms + vpath);
            }
        }

        for(int ms = 1 ; ms <= dr-sr && ms <= dc-sc ; ms++){
            ArrayList<String> dpaths = getMazePaths(sr + ms , sc + ms, dr , dc);

            for(String dpath :dpaths){
                paths.add("d" + ms + dpath);
            }
        }

        return paths;


    }

    public static void printMazePaths(int sr, int sc, int dr, int dc, String psf) {

        if(sr == dr && sc == dc){
            System.out.println(psf);
            return;
        }

        for(int ms = 1 ; ms <= dc-sc ; ms++){
            printMazePaths(sr  , sc+ ms, dr , dc , psf +"h"+ms);

        }

        for(int ms = 1 ; ms <= dr-sr ; ms++){
            printMazePaths(sr+ ms , sc , dr , dc , psf + "v"+ms);
        }

        for(int ms = 1 ; ms <= dr-sr && ms <= dc-sc ; ms++){
            printMazePaths(sr + ms , sc + ms, dr , dc ,psf + "d"+ms );

        }



    }

}
