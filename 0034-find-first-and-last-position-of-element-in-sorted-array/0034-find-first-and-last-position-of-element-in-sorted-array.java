class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] ans = {-1,-1};
        if(nums.length == 1 && nums[0] == target)return new int[]{0,0};
        int c = 0;
        int first = -1;
        int last = -1;
        for(int i = 0;i < nums.length;i++)
        {
            if(c == 0 && nums[i] == target)
            {
                first = i;
                c++;
            }
            if(nums[i] == target)
            {
                last = i;
            }
            
        }
        ans[0] = first;
        ans[1] = last;
        return ans;
    }
}