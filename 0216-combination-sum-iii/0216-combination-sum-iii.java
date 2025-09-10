class Solution {
    public void backtrack(int start,List<List<Integer>> ans,List<Integer> curr,int k,int target)
    {   
        if(target < 0) return;
        if(curr.size() == k && target == 0) 
        {
            ans.add(new ArrayList(curr));
            return;
        }
        for(int i = start;i <= 9;i++)
        {
            curr.add(i);
            backtrack(i + 1,ans,curr,k,target - i);
            curr.removeLast();
        }
    }
    public List<List<Integer>> combinationSum3(int k, int n) 
    {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> curr = new ArrayList<>();
        backtrack(1,ans,curr,k,n);
        return ans;
    }
}