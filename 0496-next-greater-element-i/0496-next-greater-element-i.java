class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Map<Integer,Integer> map = new HashMap<>();
        //Stack<Integer> s = new Stack<>();
        Deque<Integer> s = new ArrayDeque<>();
        int[] ans = new int[nums1.length];
        for(int num:nums2)
        {
            while(!s.isEmpty() && s.peek()<num)
            {
                map.put(s.pop(),num);
            }
            s.push(num);
        }
        for(int i=0;i<nums1.length;i++)
        {
            if(map.containsKey(nums1[i]))
            {
                ans[i] = map.get(nums1[i]);
            }
            else 
            {
                ans[i] = -1;
            }
        }
        return ans;
    }
}