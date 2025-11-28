class Solution {
    public int longestOnes(int[] nums, int k) {
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
            while(zerocount > k)
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
            windowsize = Math.max(windowsize,high - low + 1);
            high++;
        }
        return windowsize;
    }
}