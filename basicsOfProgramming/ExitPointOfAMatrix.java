package basicsOfProgramming;
import java.util.*;
public class ExitPointOfAMatrix {
    
    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        
        int[][] mat = new int[n][m];
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++) {
                mat[i][j] = sc.nextInt();
            }
        }
        sc.close();
        int currRow = 0, currCol = 0;
        int prevRow = 0, prevCol = 0;
        int direction = 0;
        
        while((currRow >= 0) && (currCol >= 0) && (currRow < n) && (currCol < m)) {
            if(mat[currRow][currCol] == 1) {
                // change direction
                direction = (direction + 1) % 4;
            }
            prevRow = currRow;
            prevCol = currCol;
            if(direction == 0) {
                currCol++;
            }
            else if(direction == 1) {
                currRow++;
            } else if(direction == 2) {
                currCol--;
            } else {
                currRow--;
            }
        }
        System.out.println(prevRow);
        System.out.println(prevCol);
    }
}
