class Solution {
    public String getPermutation(int n, int k) {
        int[] nums = new int[n];
        for(int i = 1;i<=n;i++)
        {
            nums[i-1] = i;
        }
        List<List<Integer>> ans = new ArrayList<>();
        backtrack(ans, new ArrayList<>(), nums, new boolean[nums.length],k);
        int count = 0;
        String s = "";
        for(List<Integer> a:ans)
        {
            if(count == k-1)
            {
                for(int str:a)
                {
                    s=s+str;
                }
            }
            count++;
        }
        return s;

    }
    public static void backtrack(List<List<Integer>> ans, List<Integer> curr, int[] nums, boolean[] used,int k) {
        if (curr.size() == nums.length) {
            ans.add(new ArrayList<>(curr));
            return;
        }
        if(ans.size() == k)
        {
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            if (!used[i]) {
                used[i] = true;
                curr.add(nums[i]);

                backtrack(ans, curr, nums, used,k);

                curr.remove(curr.size() - 1);
                used[i] = false;
            }
        }
    }
}