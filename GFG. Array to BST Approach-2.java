class Solution
{
    public int[] sortedArrayToBST(int[] nums)
    {
        int[] pre = new int[nums.length];
        createBST(nums, 0, nums.length-1, pre);
        return pre;
    }
    
    int idx = 0;
    private void createBST(int[] arr, int low, int high, int[] pre) {
        if(low > high) return;
        int mid = (low + high)/2;
        pre[idx] = arr[mid];
        idx++;
        createBST(arr, low, mid-1, pre);
        createBST(arr, mid + 1, high, pre);
    }
}
