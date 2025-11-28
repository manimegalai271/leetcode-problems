class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int low = 0;
        int high = 0;
        int windowsize = Integer.MAX_VALUE;
        int sum = 0;
        while(high < nums.length)
        {
            sum += nums[high];
            while(sum >= target)
            {
                int ws = high - low + 1;
                if(windowsize > ws)
                {
                    windowsize = ws;
                }
                sum = sum - nums[low];
                low++;
            }
            if(sum < target)
            {
                high++;
            }
        }
        return windowsize == Integer.MAX_VALUE ?0:windowsize;
    }
}