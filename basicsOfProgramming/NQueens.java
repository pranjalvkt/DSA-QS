package basicsOfProgramming;
import java.util.*;
public class NQueens {
	public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        boolean[][] chess = new boolean[n][n];
        printNQueens(chess, "", 0);
    }

    public static void printNQueens(boolean[][] chess, String qsf, int row) {
        if(row == chess.length) {
            System.out.println(qsf + ".");
            return;
        }
        
        for(int col = 0; col < chess[0].length; col++) {
            if(isQueenSafe(chess, row, col)) {
                chess[row][col] = true;
                printNQueens(chess, qsf + row + "-" + col + ", ", row + 1);
                chess[row][col] = false;
            }
        }
        
    }
    
    private static boolean isQueenSafe(boolean[][] chess, int row, int col) {
        // upward column
        for(int i = 0; i < row; i++) {
            if(chess[i][col]) {
                return false;
            }
            
        }
        
        // upward left diagonal
        int i = row, j = col;
        while(i >= 0 && j >= 0) {
            if(chess[i][j]) return false;
            i--; 
            j--;
        }
        
        //upward right diagonal
        i = row; 
        j = col;
        while(i >= 0 && j < chess.length) {
            if(chess[i][j]) return false;
            i--;
            j++;
        }
        
        return true;
    }
}
