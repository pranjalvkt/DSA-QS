package basicsOfProgramming;
import java.util.*;
public class TargetSumSubsets {
	public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        sc.close();
        printTargetSumSubsets(arr, 0, "", target);
    }

    // set is the subset
    // sos is sum of subset
    // tar is target
    public static void printTargetSumSubsets(int[] arr, int idx, String set, int target) {
        if(idx == arr.length) {
            if(target == 0) {
                System.out.println(set + ".");
            }
            return;
        }
        
        if(idx < 0) {
            return;
        }
        
        printTargetSumSubsets(arr, idx + 1, set + arr[idx] + ", ", target - arr[idx]); //yes
        printTargetSumSubsets(arr, idx + 1, set, target); //no
    }
}
