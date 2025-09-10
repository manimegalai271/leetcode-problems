class Solution {
    public void backtrack(List<List<Integer>> ans,List<Integer> curr,int[] nums)
    {
        if(curr.size() == nums.length)
        {
            ans.add(new ArrayList(curr));
            return;
        }
        for(int num:nums)
        {   
            if(!curr.contains(num))
            {
                curr.add(num);
                backtrack(ans,curr,nums);
                curr.remove(curr.size()-1);
            }
        }
    }
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> curr  = new ArrayList<>();
        backtrack(ans,curr,nums);
        return ans;
    }
}