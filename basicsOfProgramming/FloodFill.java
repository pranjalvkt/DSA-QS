package basicsOfProgramming;
import java.util.*;
public class FloodFill {
	public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        int[][] arr = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = scn.nextInt();
            }
        }
        scn.close();
        boolean[][] visited = new boolean[n][m];
        
        floodfill(arr, 0, 0, "", visited);
    }
    
    // asf -> answer so far
    public static void floodfill(int[][] maze, int sr, int sc, String psf, boolean[][] visited) {
        
        int dr = maze.length - 1;
        int dc = maze[0].length - 1;
        
        if(sr > dr || sc > dc || sr < 0 || sc < 0 || maze[sr][sc] == 1 || visited[sr][sc]) {
            /* maze[sr][sc] == 1 last me likhege warna index out of bound aa 
            jaayega */
            return;
        }
        
        if(sr == dr && sc == dc) {
            System.out.println(psf);
            return;
        }
        
        visited[sr][sc] = true;
        
        floodfill(maze, sr - 1, sc, psf + "t", visited); // top
        floodfill(maze, sr, sc - 1, psf + "l", visited); // left
        floodfill(maze, sr + 1, sc, psf + "d", visited); // down
        floodfill(maze, sr, sc + 1, psf + "r", visited); // right
        
        visited[sr][sc] = false;
        
    }
}
