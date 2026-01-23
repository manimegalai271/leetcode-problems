class Solution {
    public int singleNumber(int[] nums) {
        int bits = nums[0];
        for(int i = 1;i < nums.length;i++)
        {
            bits ^= nums[i];
        }
        return bits;
    }
}