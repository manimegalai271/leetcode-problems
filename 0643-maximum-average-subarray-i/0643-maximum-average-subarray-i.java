class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int start = 0;
        int end = 0;
        int max = Integer.MIN_VALUE;
        int sum = 0;
        while(end < nums.length)
        {
            sum+=nums[end];
            if(end-start+1 < k)
            {
                end++;
            }
            else 
            {
                if(max < sum)
                {
                    max = sum;
                }
                sum -= nums[start];
                start++;
                end++;
            }
        }
        double ans = (double) max / k;
        return ans;
    }
}