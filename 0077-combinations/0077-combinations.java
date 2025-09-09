class Solution {
    public void backtrack(int start,List<List<Integer>> ans,List<Integer> curr,int n,int k)
    {
        if(curr.size() == k)
        {
            ans.add(new ArrayList(curr));
            return;
        }
        for(int i = start;i <= n;i++)
        {
            curr.add(i);
            backtrack(i+1,ans,curr,n,k);
            curr.removeLast();
        }
    }
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> curr = new ArrayList<>();
        backtrack(1,ans,curr,n,k);
        return ans;
    }
}