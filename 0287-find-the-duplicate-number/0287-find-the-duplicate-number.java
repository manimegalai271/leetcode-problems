class Solution {
    public int findDuplicate(int[] nums) {
        for(int i:nums)
        {   
            int o=Math.abs(i);
            if(nums[o-1]<0)
            {
                return o;
            }
            nums[o-1]*=-1;
        }
        return -1;
    }
}