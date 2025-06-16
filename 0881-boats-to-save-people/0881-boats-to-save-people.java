import java.util.Arrays;

class Solution {
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people); // Sort the array
        int i = 0; // Lightest person
        int j = people.length - 1; // Heaviest person
        int count = 0;

        while (i <= j) {
            if (people[i] + people[j] <= limit) {
                i++; // Pair formed, move i
            }
            j--; // Boat used, heaviest person goes
            count++; // One boat used
        }

        return count;
    }
}
