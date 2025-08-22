class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Map<Integer,Integer> map=new HashMap<>();
        Deque<Integer> s=new ArrayDeque();
        int[] res=new int[nums1.length];
        for(int ele:nums2)
        {
            while(!s.isEmpty() && s.peek()<ele)
            {
                map.put(s.pop(),ele);
            }
            s.push(ele);

        }
        for(int i=0;i<nums1.length;i++)
        {
            res[i] = map.containsKey(nums1[i])?map.get(nums1[i]):-1;
        }
        return res;

    }
}