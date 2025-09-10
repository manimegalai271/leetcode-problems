class Solution {
    public void backtrack(List<List<Integer>> ans, List<Integer> curr, int[] nums, boolean[] used) {
        if (curr.size() == nums.length) {
            ans.add(new ArrayList<>(curr));
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            if (!used[i]) {
                used[i] = true;
                curr.add(nums[i]);

                backtrack(ans, curr, nums, used);

                curr.remove(curr.size() - 1);
                used[i] = false;
            }
        }
    }

    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        backtrack(ans, new ArrayList<>(), nums, new boolean[nums.length]);
        return ans;
    }
}
