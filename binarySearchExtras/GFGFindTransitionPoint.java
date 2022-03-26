package binarySearchExtras;
import java.io.*;
public class GFGFindTransitionPoint {
	int transitionPoint(int arr[], int n) {
        // code here
        int left = 0, right = n - 1;
        int ans = -1;
        while(left <= right) {
            int mid = left + (right - left) / 2;
            
            if(arr[mid] == 1) {
                ans = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return ans;
    }
}
