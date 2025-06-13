class Solution {
    public int missingNumber(int[] nums) {
        int l=nums.length;
        int n=l*(l+1)/2;
        int sum=0;
        for(int num:nums)
        {
            sum+=num;
        }
        return n-sum;
    }
}