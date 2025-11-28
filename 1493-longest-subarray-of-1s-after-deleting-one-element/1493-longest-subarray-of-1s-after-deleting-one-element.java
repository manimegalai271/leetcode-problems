class Solution {
    public int longestSubarray(int[] nums) {
        int low = 0;
        int high = 0;
        int windowsize = 0;
        int zerocount = 0;
        while(high < nums.length)
        {
            if(nums[high] == 0)
            {
                zerocount++;
            }
            while(zerocount > 1)
            {
                if(nums[low] == 0)
                {
                    low++;
                    zerocount--;
                }
                else 
                {
                    low++;
                }
            }
            windowsize = Math.max(windowsize,high - low );
            high++;
        }
        return windowsize;
    }
}