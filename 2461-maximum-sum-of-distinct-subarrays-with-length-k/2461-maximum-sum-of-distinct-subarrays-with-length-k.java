class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        long max_sum = 0;
        int low = 0;
        int high = 0;
        long sum = 0;
        Map<Integer,Integer> freq = new HashMap<>();

        while(high < nums.length)
        {
            sum += nums[high];
            if(freq.containsKey(nums[high]))
            {
                freq.put(nums[high],freq.get(nums[high]) + 1);
            }
            else 
            {
                freq.put(nums[high],1);
            }

            int window_size = high - low + 1;

            if(window_size == k)
            {
                int freq_size = freq.size();

                if(freq_size == k)
                {
                    max_sum = Math.max(max_sum,sum);
                }

                // shrink window (this was missing earlier)
                sum -= nums[low];
                if(freq.get(nums[low]) == 1)
                {
                    freq.remove(nums[low]);
                }
                else 
                {
                    freq.put(nums[low],freq.get(nums[low]) - 1);
                }
                low++;
            }

            high++;
        }

        return max_sum;
    }
}
