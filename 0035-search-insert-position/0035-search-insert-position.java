class Solution {
    public int searchInsert(int[] nums, int target) {
        List<Integer> l = new ArrayList<>();
        for(int i = 0;i < nums.length;i++)
        {
             l.add(nums[i]);
        }
        for(int i = 0;i < nums.length;i++)
        {   
            if(nums[i] == target)
            {
                return i;
            }
        }
        if(l.get(0) > target)l.add(0,target);
        for(int i = 0;i < l.size()-1;i++)
        {   
            if(l.get(i) < target && l.get(i+1) > target)
            {
                l.add(i+1,target);
            }
        }
        if(l.size() == nums.length)
        {
            l.add(target);
        }
        for(int i = 0;i < l.size();i++)
        {
            if(l.get(i) == target)
            {
                return i;
            }
        }
        return 0;
    }
}
//Brute Force Apporach
//Time Complexity = O(n)
//Space Complexity = o(n)