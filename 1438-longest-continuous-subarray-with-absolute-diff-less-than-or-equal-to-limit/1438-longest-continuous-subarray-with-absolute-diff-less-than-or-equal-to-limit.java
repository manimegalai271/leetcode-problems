import java.util.*;

class Solution {
    public int longestSubarray(int[] nums, int limit) {
        Deque<Integer> inc = new ArrayDeque<>(); // increasing deque (min at front)
        Deque<Integer> dec = new ArrayDeque<>(); // decreasing deque (max at front)

        int maxLength = 0;
        int left = 0;

        for (int i = 0; i < nums.length; i++) {
            int el = nums[i];

            // maintain increasing deque
            while (!inc.isEmpty() && el < inc.peekLast()) {
                inc.pollLast();
            }
            inc.offerLast(el);

            // maintain decreasing deque
            while (!dec.isEmpty() && el > dec.peekLast()) {
                dec.pollLast();
            }
            dec.offerLast(el);

            // shrink window if condition breaks
            while (!dec.isEmpty() && !inc.isEmpty() &&
                   dec.peekFirst() - inc.peekFirst() > limit) {

                if (nums[left] == dec.peekFirst()) {
                    dec.pollFirst();
                }
                if (nums[left] == inc.peekFirst()) {
                    inc.pollFirst();
                }
                left++;
            }

            // update max window length
            maxLength = Math.max(maxLength, i - left + 1);
        }

        return maxLength;
    }
}
