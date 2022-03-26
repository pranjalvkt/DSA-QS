package binarySearchExtras;

public class GFGNumberOfOccurrence {
	int count(int[] arr, int n, int x) {
        // code here
        int first = firstOcc(arr, x);
        int last = lastOcc(arr, x);
        if(first == -1 && last == -1) return 0	;
        return (last - first) + 1;
    }
    int firstOcc(int[] arr, int target) {
        int left = 0, right = arr.length - 1;
        int ans = -1;
        while(left <= right) {
            int mid = left + (right - left) / 2;
            if(arr[mid] == target) {
                ans = mid;
                right = mid - 1;
            } 
            else if(arr[mid] < target) left = mid + 1;
            else right = mid - 1;
        }
        return ans;
    }
    int lastOcc(int[] arr, int target) {
        int left = 0, right = arr.length - 1;
        int ans = -1;
        while(left <= right) {
            int mid = left + (right - left) / 2;
            if(arr[mid] == target) {
                ans = mid;
                left = mid + 1;
            }
            else if(arr[mid] < target) left = mid + 1;
            else right = mid - 1;
        }
        return ans;
    }
}
