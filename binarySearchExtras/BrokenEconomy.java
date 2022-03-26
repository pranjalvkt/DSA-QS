package binarySearchExtras;
import java.util.*;
public class BrokenEconomy {
	public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        System.out.println(ceil(arr, target));
        System.out.println(floor(arr, target));
    }

    private static int ceil(int[] arr, int target) {
        int left = 0; 
        int right = arr.length - 1;
        while(left <= right) {
            int mid = left + (right - left) / 2;

            if(arr[mid] <= target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return arr[left];
    }

    private static int floor(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;
        while(left <= right) {
            int mid = left + (right - left) / 2;

            if(arr[mid] >= target) {
                right = mid - 1; 
            } else {
                left = mid + 1;
            }
        }
        return arr[right];
    }

}
