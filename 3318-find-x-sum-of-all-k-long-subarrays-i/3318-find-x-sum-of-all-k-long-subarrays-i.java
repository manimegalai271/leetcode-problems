class Solution {
    public int[] findXSum(int[] nums, int k, int x) {
        int n = nums.length;
        if (k > n) return new int[0];
        int[] ans = new int[n - k + 1];

        for (int i = 0; i <= n - k; i++) {
            // frequency map for window [i, i+k-1]
            Map<Integer, Integer> freq = new HashMap<>();
            for (int j = i; j < i + k; j++) {
                freq.put(nums[j], freq.getOrDefault(nums[j], 0) + 1);
            }

            // sort entries by (frequency desc, value desc)
            List<Map.Entry<Integer, Integer>> entries = new ArrayList<>(freq.entrySet());
            entries.sort((e1, e2) -> {
                int cmp = Integer.compare(e2.getValue(), e1.getValue()); // freq desc
                if (cmp != 0) return cmp;
                return Integer.compare(e2.getKey(), e1.getKey()); // value desc on tie
            });

            // sum top x elements as value * frequency
            long sum = 0; // use long to be safe, convert to int at the end
            for (int t = 0; t < Math.min(x, entries.size()); t++) {
                Map.Entry<Integer, Integer> e = entries.get(t);
                sum += (long)e.getKey() * e.getValue();
            }
            ans[i] = (int) sum;
        }

        return ans;
    }
}