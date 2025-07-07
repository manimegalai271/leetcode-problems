class Solution {
    public int maxSubArray(int[] nums) {
        int sum = 0;
        int maxi = nums[0]; // Initialize with first element to handle all-negative arrays

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            if (sum > maxi) {
                maxi = sum;
            }
            if (sum < 0) {
                sum = 0;
            }
        }

        return maxi;
    }
}
