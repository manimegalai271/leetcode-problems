class Solution {
    public int[] resultsArray(int[] nums, int k) {
        int n = nums.length;
        if (k <= 0 || k > n) {
            throw new IllegalArgumentException("k must be between 1 and nums.length");
        }

        int[] ans = new int[n - k + 1];

        for (int i = 0; i <= n - k; i++) {            // start of window
            int max = Integer.MIN_VALUE;
            boolean flag = false;

            // iterate the whole window from i to i+k-1
            for (int j = i; j < i + k; j++) {
                // check ascending with next element (only if next exists in window)
                if (j < i + k - 1 && nums[j] >= nums[j + 1]) {
                    flag = true;
                    break;
                }
                // update max for every element in the window
                if (nums[j] > max) max = nums[j];
            }

            if (flag) ans[i] = -1;
            else ans[i] = max;
        }

        return ans;
    }
}
