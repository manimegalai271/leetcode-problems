class Solution {
    public int totalFruit(int[] nums) {
        Map<Integer,Integer> basket = new HashMap<>();
        int left = 0;
        int maxfruits = 0;
        for(int right = 0;right < nums.length;right++)
        {
            if(basket.containsKey(nums[right]))
            {
                basket.put(nums[right],basket.get(nums[right]) + 1);
            }
            else 
            {
                basket.put(nums[right],1);
            }
            while(basket.size() > 2)
            {
                int count = basket.get(nums[left]);
                if(count == 1)
                {
                    basket.remove(nums[left]);
                }
                else 
                {
                    basket.put(nums[left],basket.get(nums[left])- 1);
                }
                left++;
            }
            maxfruits = Math.max(maxfruits,right - left + 1);
        }
        return maxfruits;
    }
}