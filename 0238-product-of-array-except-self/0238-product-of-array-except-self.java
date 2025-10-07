class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] lp = new int[nums.length];
        int[] rp = new int[nums.length];
        lp[0] = 1;
        rp[nums.length -1] = 1;
        for(int i = 0;i < nums.length -1;i++)
        {
            lp[i + 1] = lp[i] * nums[i];
        }
        for(int i = nums.length-1;i > 0;i--)
        {
            rp[i-1] = rp[i] * nums[i];
        }
        for(int i = 0;i < nums.length;i++)
        {
            nums[i] = lp[i] * rp[i];
        }
        return nums;
    }
}