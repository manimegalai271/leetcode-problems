class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            if(map.containsKey(nums[i]))
            {
                int a=map.get(nums[i]);
                int b=i;
                int c=b-a;
                if(c<=k)
                {   
                    return true;
                }
            }
            map.put(nums[i],i);
        }
        return false;
    }
}