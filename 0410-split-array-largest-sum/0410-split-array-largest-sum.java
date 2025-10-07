class Solution {
    public int subarray(int mid,int[] nums)
    {  
        int sum = 0;
        int count = 0;
        for(int i = 0;i < nums.length;i++)
        {
            if(sum+nums[i] <= mid)
            {
                sum += nums[i]; 
            }
            else 
            {
                count++;
                sum = nums[i];
            }
        }
        count++;
        return count;

    }
    public int splitArray(int[] nums, int k) {
        int left = 0;
        int right = 0;
        int n = nums.length;
        for(int i = 0;i < nums.length;i++)
        {
            left = Math.max(left,nums[i]);
            right += nums[i];
        }
        int ans = 0;
        while(left <= right)
        {
            int mid = (left + right) / 2;
            int count = subarray(mid,nums); 
            if(count <= k)
            {
                ans = mid;
                right = mid - 1;
            }
            else 
            {
                left = mid + 1;
            }
        }
        return ans;
    }
}