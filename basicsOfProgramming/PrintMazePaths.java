package basicsOfProgramming;
import java.util.*;
public class PrintMazePaths {
	public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        sc.close();
        printMazePaths(0, 0, n-1, m-1, "");
    }

    // sr - source row
    // sc - source column
    // dr - destination row
    // dc - destination column
    public static void printMazePaths(int sr, int sc, int dr, int dc, String psf) {
        //positive
        if(sr == dr && sc == dc) {
            System.out.println(psf);
            return;
        }
        //negative
        if(sr > dr || sc > dc) {
            return;
        }
        
        printMazePaths(sr, sc + 1, dr, dc, psf + "h");
        printMazePaths(sr + 1, sc, dr, dc, psf + "v");
        
    }
}
