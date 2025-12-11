class Solution {
    public int lengthOfLIS(int[] nums) {
        int n = nums.length;
        int[] dp = new int[n];
        int size = 0;
        for(int num:nums)
        {   
            int l = 0; 
            int r = size;
            while(l < r)
            {
                int mid = (l + r)/2;
                if(dp[mid] < num)l= mid+1;
                else r = mid;
            }
            dp[l] = num;
            if(l == size)size++;
        }
        return size;
    }
}