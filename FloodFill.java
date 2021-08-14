public class FloodFill {


    public static void main(String[] args) {

        int maze[][] = {{0,0,0},
                        {1,0,1},
                        {0,0,0}};


        boolean[][] visited = new boolean[maze.length][maze[0].length];

        floodfill(maze , 0 , 0 , "" , visited);

    }

    public static void floodfill(int[][] maze, int sr, int sc, String asf , boolean [][] visited) {

        if(sr < 0 || sc < 0 || sr == maze.length || sc == maze[0].length || maze[sr][sc] == 1 || visited[sr][sc] == true){
            return;
        }

        if(sr == (maze.length -1) && sc == (maze[0].length -1)){
            System.out.println(asf);
            return;
        }

        visited[sr][sc] = true;
        floodfill(maze , sr - 1 , sc , asf + "t" , visited);
        floodfill(maze , sr , sc - 1 , asf + "l" , visited);
        floodfill(maze , sr + 1 , sc , asf + "d" , visited);
        floodfill(maze , sr , sc + 1 , asf + "r" , visited);
        visited[sr][sc] = false;

    }
}
