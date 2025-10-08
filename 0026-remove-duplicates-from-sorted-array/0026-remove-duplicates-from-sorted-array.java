import java.util.*;

class Solution {
    public int removeDuplicates(int[] nums) {
        // Use TreeSet to keep unique elements in sorted (ascending) order
        Set<Integer> set = new TreeSet<>();
        
        // Add all elements to set
        for (int n : nums) {
            set.add(n);
        }

        // Copy back unique sorted elements to nums[]
        int k = 0;
        for (int n : set) {
            nums[k++] = n;
        }

        // Return the number of unique elements
        return k;
    }
}
