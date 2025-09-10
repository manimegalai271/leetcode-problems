class Solution {
    public void backtrack(int start,List<List<Integer>> ans,List<Integer> curr,int[] candidates,int target)
    {
        if(target < 0)
        {
            return;
        }
        if(target == 0)
        {
            ans.add(new ArrayList(curr));
            return;
        }
        for(int i = start;i < candidates.length;i++)
        {   if(i > start && candidates[i] == candidates[i-1])
            {
                continue;
            }
            curr.add(candidates[i]);
            backtrack(i+1,ans,curr,candidates,target - candidates[i]);
            curr.removeLast();
        }
    }
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> curr = new ArrayList<>();
        Arrays.sort(candidates);
        backtrack(0,ans,curr,candidates,target);
        return ans;
    }
}