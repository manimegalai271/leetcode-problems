class Solution {
    public boolean canJump(int[] nums) {
        int jump = nums[0];
        for(int i = 1;i < nums.length;i++)
        {   
            jump--;
            if(jump < 0)return false;
            if(i == nums.length - 1)return true;
            if(jump < nums[i])
            {
                jump = nums[i];
            }
        }
        return true;
    }
}