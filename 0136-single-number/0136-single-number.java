class Solution {
    public int singleNumber(int[] nums) {
       int bit=nums[0];
       for(int i=1;i<nums.length;i++)
       {
          
            bit=bit^nums[i];
           
       }
       return bit;
    }
}