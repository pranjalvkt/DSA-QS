package basicsOfProgramming;
import java.util.*;
public class RotateBy90Degree {
    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][n];
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        sc.close();
        transpose(arr);
        swapColumns(arr);
        display(arr);
    }
    
    private static void swapColumns(int[][] arr) {
        int leftCol = 0, rightCol = arr[0].length - 1;
        while(leftCol < rightCol) {
            for(int i = 0; i < arr.length; i++) {
                swap(arr, i, leftCol, rightCol);
            }
            leftCol++;
            rightCol--;
        }
    }
    
    private static void swap(int[][] arr, int i, int j) {
        int temp = arr[i][j];
        arr[i][j] = arr[j][i];
        arr[j][i] = temp;
    }
    
    private static void swap(int[][] arr, int i, int leftCol, int rightCol) {
        int temp = arr[i][leftCol];
        arr[i][leftCol] = arr[i][rightCol];
        arr[i][rightCol] = temp;
    }
    
    private static void transpose(int[][] arr) {
        for(int i = 0; i < arr.length; i++) {
            for(int j = i + 1; j < arr[0].length; j++) {
                swap(arr, i, j);
            }
        }
    }
    public static void display(int[][] arr){
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[0].length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
