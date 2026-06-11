class Solution {
    public int removeElement(int[] nums, int val) {
        int n = nums.length;
        int val_count = 0;
        int j = n - 1;
        for(int i = 0;i < nums.length;i++)
        {
            if(nums[i] == val)
            {
                val_count++;
                if(nums[j] != val)
                {
                    nums[i] = nums[j];
                    j--;
                }
            }

        }
        int i = 0;
        while(i < j && j < nums.length)
        {
            if(nums[i] == val)
            {
                if(nums[j] != val)
                {   
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                    i++;
                    j--;
                }
                else 
                {
                    j--;
                }
            }
            else
            {
                i++;
            }
        }
        return n - val_count;
    }
}