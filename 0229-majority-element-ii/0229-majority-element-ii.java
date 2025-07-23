class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n=nums.length;
        Map<Integer,Integer> map=new HashMap<>();
        List<Integer> list=new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            if(map.containsKey(nums[i]))
            {
               map.put(nums[i],map.get(nums[i]) +1);
            }
            else 
            {
                map.put(nums[i],1);
            }
        }
        for(int key:map.keySet())
        {
            int count=map.get(key);
            if(count>n/3)
            {
                list.add(key);
            }
        }
        return list;
    }
}