package binarySearchExtras;

public class LC34FindFirstAndLastPositionOfElementInSortedArray {
	private int firstOcc(int[] arr, int target) {
        int left = 0, right = arr.length - 1;
        int ans = -1;
        while(left <= right) {
            int mid = left + (right - left) / 2;
            
            if(arr[mid] == target) { // > =
                ans = mid;
                right = mid - 1;
            }
            if(arr[mid] < target) left = mid + 1;
            else right = mid - 1;
        }
        return ans;
    }
    
    private int lastOcc(int[] arr, int target) {
        int left = 0, right = arr.length - 1;
        int ans = -1;
        while(left <= right) {
            int mid = left + (right - left) / 2;
            
            if(arr[mid] == target) { // < =
                ans = mid;
                left = mid + 1;
            }
            else if(arr[mid] < target) left = mid + 1;
            else right = mid - 1;
        }
        return ans;
    }
    public int[] searchRange(int[] nums, int target) {
        int[] ans = {-1, -1};
        
        if(nums.length == 0) return ans;
        ans[0] = firstOcc(nums, target);
        ans[1] = lastOcc(nums, target);
        
        return ans;
    }
}
