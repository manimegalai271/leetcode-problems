
class Solution {
    public String sortColors(int[] nums) {
        int[] count=new int[3];
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==0)
            {
                count[0]++;
            }
            else if(nums[i]==1)
            {
                count[1]++;
            }
            else 
            {
                count[2]++;
            }
        }
            int o=0;
            for(int i=0;i<count.length;i++)
            {
            for(int j=0;j<count[i];j++)
            {
                nums[o]=i;
                o++;
            }
            }
            return Arrays.toString(nums);
    }
}