package binarySearchExtras;
import java.io.*;
public class LC35SearchInsertPosition {
	public int searchInsert(int[] nums, int target) {
        int left = 0, right = nums.length - 1;
        
        
        while(left <= right) {
            int mid = left + (right - left) / 2;
            if(nums[mid] == target) return mid;
            if(nums[mid] > target) right = mid - 1;
            else left = mid + 1;
        }
        return left;
    }
}
