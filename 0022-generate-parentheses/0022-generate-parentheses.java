class Solution {
    //Recursive helper function
    public void generate(List<String> result, int max, int open, int close, String unProcessed) {
        // Base case: if the length is 2*max, we've formed a valid combination
        if (unProcessed.length() == (2 * max)) {
            result.add(unProcessed);
            return;
        }

        // If we can add more "(", do so
        if (open < max) {
            generate(result, max, open + 1, close, unProcessed + "(");
        }

        // If we can add ")", do so
        if (close < open) {
            generate(result, max, open, close + 1, unProcessed + ")");
        }
    }

    // Main function to generate parentheses
    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        generate(result, n, 0, 0, "");
        return result;
    }
}