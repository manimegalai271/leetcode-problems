class Solution {
    public int findGCD(int[] nums) {
        int max=0;
        int min=nums[0];
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]>max)
            {
                max=nums[i];
            }
            else if(nums[i]<min)
            {
                min=nums[i];
            }
        }
        while(min!=0)
        {
            int temp=min;
            min=max%min;
            max=temp;
        }
        return max;
    }
}