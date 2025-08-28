class Solution {
    public int findDuplicate(int[] nums) {
        Set<Integer> s = new HashSet();
        for(int ele:nums)
        {
            if(s.contains(ele))return ele;
            s.add(ele);
        }
        return 0;
    }
}