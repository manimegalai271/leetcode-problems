class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        int[] arr = new int[n+1];
        arr[0] = 0;
        arr[1] = nums[0];
        for(int i = 1;i < n;i++)
        {
           arr[i+1] = Math.max(arr[i],nums[i]+arr[i-1]);
        }
        return arr[n];
    }

}
// TC -o(n)
// SC -o(n)