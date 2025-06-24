class Solution {
    public boolean checkPossibility(int[] nums) {
        int modify=0;
        for(int i=1;i<nums.length;i++)
        {
            if(nums[i-1]>nums[i])
            {
                if(i-2>=0)
                {
                    if(nums[i-1]>nums[i] && nums[i-2]<=nums[i])
                    {
                        nums[i-1]=nums[i];
                        modify++;
                    }
                    else if(nums[i-2]>nums[i])
                    {
                        nums[i]=nums[i-1];
                        modify++;
                    }
                }
                else 
                {
                    nums[i-1]=nums[i];
                    modify++;
                }
            }
        }
        if(modify<=1)
        {
            return true;
        }
        else 
        {
            return false;
        }
    }
}