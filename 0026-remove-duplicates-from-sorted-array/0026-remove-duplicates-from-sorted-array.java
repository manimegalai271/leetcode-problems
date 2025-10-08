class Solution {
    public int removeDuplicates(int[] nums) {
        Set<Integer> s = new HashSet<>();
        for(int i = 0;i < nums.length;i++)
        {
            s.add(nums[i]);
        }
        int k = 0;
        for(int set:s)
        {
            nums[k++] = set;
        }
        return s.size();
    }
}