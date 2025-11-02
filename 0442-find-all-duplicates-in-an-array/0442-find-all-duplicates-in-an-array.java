class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        Map<Integer,Integer> freq = new HashMap<>();
        for(int i = 0;i < nums.length;i++)
        {
            if(freq.containsKey(nums[i]))
            {
                freq.put(nums[i],freq.get(nums[i]) + 1);
            }
            else 
            {
                freq.put(nums[i],1);
            }
        }
        for(int key:freq.keySet())
        {
            if(freq.get(key) == 2)
            {
                ans.add(key);
            }
        }
        return ans;
    }
}