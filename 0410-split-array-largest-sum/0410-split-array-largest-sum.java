class Solution {
    public int splitArray(int[] nums, int k) {
        int low = 0, high = 0;
        for (int n : nums) {
            low = Math.max(low, n);
            high += n;
        }

        while (low < high) {
            int mid = low + (high - low) / 2;
            if (canSplit(nums, k, mid)) {
                high = mid; // try smaller max
            } else {
                low = mid + 1; // need bigger max
            }
        }
        return low;
    }

    private boolean canSplit(int[] nums, int k, int maxSum) {
        int count = 1; // at least one subarray
        int currentSum = 0;

        for (int n : nums) {
            if (currentSum + n > maxSum) {
                count++; // new subarray
                currentSum = n;
                if (count > k) return false;
            } else {
                currentSum += n;
            }
        }
        return true;
    }
}
