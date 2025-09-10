class Solution {
    public void backtrack(int start,List<List<Integer>> ans,List<Integer> curr,int[] nums)
    {   ans.add(new ArrayList(curr));
        for(int i = start;i < nums.length;i++)
        {   
            curr.add(nums[i]);
            backtrack(i + 1,ans,curr,nums);
            curr.removeLast();
        }
    }
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> curr  = new ArrayList<>();
        backtrack(0,ans,curr,nums);
        return ans;
    }
}