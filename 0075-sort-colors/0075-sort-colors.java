class Solution {
    public void sortColors(int[] nums) {
        int zero_count = 0;
        int ones_count = 0;
        int twos_count = 0;
        for(int i = 0;i < nums.length;i++)
        {
            if(nums[i] == 0)
            {
                zero_count++;
            }
            else if(nums[i] == 1)
            {
                ones_count++;
            }
            else if(nums[i] == 2)
            {
                twos_count++;
            }
        }
        for(int i = 0;i < nums.length;i++)
        {
            if(zero_count > 0)
            {
                nums[i] = 0;
                zero_count--;
            }
            else if(ones_count > 0)
            {
                nums[i] = 1;
                ones_count--;
            }
            else if(twos_count > 0)
            {
                nums[i] = 2;
                twos_count--;
            }
        }
    }
}