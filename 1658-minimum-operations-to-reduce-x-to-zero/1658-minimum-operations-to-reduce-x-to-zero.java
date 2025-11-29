class Solution {
    public int minOperations(int[] nums, int x) {
        int window_size = -1;
        int tot_sum = 0;
        for(int i = 0;i < nums.length;i++)
        {
            tot_sum += nums[i];
        }
        int target = tot_sum - x;
        int low = 0;
        int high = 0;
        int sum = 0;
        Boolean found = false;
        while(high < nums.length)
        {
            sum += nums[high];
            while(low <= high && target < sum)
            {   
                sum -= nums[low];
                low++;
            }
            if(sum == target)
            {   
                window_size = Math.max(high - low + 1,window_size);
                found = true;
            }
            high++;
        }
        return found?nums.length - window_size:-1;
    }
}