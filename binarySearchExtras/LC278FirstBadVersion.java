package binarySearchExtras;

public class LC278FirstBadVersion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	static boolean isBadVersion(int n) {
		// Already implemented by LeetCode Problem
		return true;
	}
	
	public int firstBadVersion(int n) {
        int left = 0, right = n;
        int ans = -1;
        
        while(left <= right) {
            int mid = left + (right - left) / 2;
            
            if(isBadVersion(mid) == false ) {
                left = mid + 1;
            }
            else {
                ans = mid;
                right = mid - 1;
            }
        }
        return ans;
    }

}
