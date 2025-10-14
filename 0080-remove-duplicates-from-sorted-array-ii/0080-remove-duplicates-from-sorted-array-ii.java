class Solution {
    public int removeDuplicates(int[] nums) {
        Map<Integer,Integer> map = new LinkedHashMap<>();
        for(int i = 0;i < nums.length;i++)
        {
            if(map.containsKey(nums[i]))
            {
                map.put(nums[i],map.get(nums[i]) + 1);
            }
            else 
            {
                map.put(nums[i],1);
            }
        }
        int index = 0;
        for(int m:map.keySet())
        {   
            int freq = Math.min(2,map.get(m));
            for(int i = 0;i < freq;i++)
            {
                nums[index++] = m;
            }
        }
        return index;
    }
}
//Brute force apporach
//Time complexity = o(n)
//Space complexity = o(n)