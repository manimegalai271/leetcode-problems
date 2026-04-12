class Solution {
    public int findMin(int[] nums) {
        if(nums.length == 1)
        {
             return nums[0];
        }
        int left = 0;
        while(left < nums.length - 2)
        {
           if(nums[left] > nums[left + 1] && nums[left + 2] > nums[left + 1])
           {
               return nums[left + 1];
           }
           left++;
        }
        int min = Integer.MAX_VALUE;
        int min2 = Integer.MAX_VALUE;
        if(nums[0] < nums[1])
        {
            min = nums[0];
        }
        if(nums[nums.length - 1] < nums[nums.length - 2])
        {
            min2 = nums[nums.length - 1];
        }
        return Math.min(min,min2);
    }
}