class Solution {
    public boolean divideArray(int[] nums) {
		Arrays.sort(nums);
		int count=1;
		for(int i=0;i<nums.length-1;i++)
		{
			if(nums[i]==nums[i+1])
			{
				count++;
			}
			else 
			{
				if(count%2==0)
				{   
					count=1;
					continue;
				}
				else 
				{
					return false;
				}
			}
		}
		return true;
    }
}