class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int num:nums)
        {
            if(map.containsKey(num))
            {
                map.put(num,map.get(num) + 1);
            }
            else 
            {
              map.put(num,1);
            }
        }
        Map<Integer,List<Integer>> swapmap = new HashMap<>();
        for(int key:map.keySet())
        {
            int keys = map.get(key);
            if(!swapmap.containsKey(keys)) swapmap.put(keys,new ArrayList());
            swapmap.get(keys).add(key);
            
        }
        int[] ans = new int[k];
        int index = 0;
        for(int i = nums.length;i>=1;i--)
        {
            if(swapmap.containsKey(i))
            {
                for(int n:swapmap.get(i))
                {
                    if(index < k)
                    {
                        ans[index++] = n;
                    }
                    else 
                    {
                        break;
                    }
                }
                if(index >= k)
                {
                    break;
                }
            }
        }
        return ans;
    }
}