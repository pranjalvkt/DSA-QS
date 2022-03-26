package binarySearchExtras;
//GFG Problem
public class FindTransitionPoint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	int transitionPoint(int arr[], int n) {
	    // code here
	    int ans = -1;
	    int left = 0, right = n - 1;
	    while(left <= right) {
	        int mid = left + (right - left) / 2;
	        if(arr[mid] == 0) {
	            left = mid + 1;
	        } else {
	            ans = mid;
	            right = mid - 1;
	        }
	    }
	    return ans;
	}

}
