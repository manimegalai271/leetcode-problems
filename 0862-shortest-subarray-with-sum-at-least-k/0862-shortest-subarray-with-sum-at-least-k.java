import java.util.*;

class Solution {
    public int shortestSubarray(int[] nums, int k) {
        int N = nums.length, res = N + 1;
        long[] prefixSum = new long[N + 1];
        for (int i = 0; i < N; i++) {
            prefixSum[i + 1] = prefixSum[i] + nums[i];
        }

        Deque<Integer> d = new ArrayDeque<>();

        for (int i = 0; i <= N; i++) {
            // Check if the current window satisfies the condition
            while (!d.isEmpty() && prefixSum[i] - prefixSum[d.getFirst()] >= k) {
                res = Math.min(res, i - d.pollFirst());
            }

            // Maintain increasing order in the deque
            while (!d.isEmpty() && prefixSum[i] <= prefixSum[d.getLast()]) {
                d.pollLast();
            }

            d.addLast(i);
        }

        return res <= N ? res : -1;
    }
}
