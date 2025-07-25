class Solution {
    public int search(int[] nums, int target) {
    	int left=0;
    	int right=nums.length-1;
    	int mid=nums.length/2;
    	while(left<=right)
    	{   
    	    mid=(left+right)/2;
    	    if(nums[mid]==target)
    	    {
    	        return mid;
    	    }
    	    else if(nums[mid]>target)
    	    {
    	        right=mid-1;
    	    }
    	    else 
    	    {
    	        left=mid+1;
    	    }
    	}
        return -1;
    }
}