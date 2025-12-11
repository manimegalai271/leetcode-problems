class Solution {
    public int lengthOfLIS(int[] nums) {
        int[] tail = new int[nums.length];
        int size = 0;

        for (int num : nums) {
            int l = 0, r = size;

            while (l < r) {
                int mid = (l + r) / 2;
                if (tail[mid] < num) l = mid + 1;
                else r = mid;
            }

            tail[l] = num;
            if (l == size) size++;
        }

        return size;
    }
}
