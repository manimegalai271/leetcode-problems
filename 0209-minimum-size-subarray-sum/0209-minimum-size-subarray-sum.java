class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int low = 0;
        int high = 0;
        int windowsize = 0;
        int sum = 0;
        Boolean flag = false;
        while(high < nums.length)
        {
            sum += nums[high];
            while(sum >= target)
            {
                int ws = high - low + 1;
                if(!flag)
                {
                    windowsize = ws;
                    flag = true;
                }
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
        return windowsize;
    }
}