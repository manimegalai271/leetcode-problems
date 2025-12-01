class Solution {
    public int takeCharacters(String s, int k) {
        int[] freq = new int[3];
        int left = 0;
        while(left < s.length() && (freq[0] < k || freq[1] < k || freq[2] < k))
        {   
            freq[s.charAt(left) - 'a']++;
            left++;
        }
        if(freq[0] < k || freq[1] < k || freq[2] < k)
        {
            return -1;
        }
        int min_time = left;
        left--;
        int right = s.length() - 1;
        while(left >= 0)
        {   
            freq[s.charAt(left) - 'a']--;
            left--;
            while(left <= right && (freq[0] < k || freq[1] < k || freq[2] < k))
            {
                freq[s.charAt(right) - 'a']++;
                right--;
            }
            min_time = Math.min(min_time,s.length() - (right - left));
        }
        return min_time;
    }
}
//Time complexity  =o(n)
//Space complexity = o(1)