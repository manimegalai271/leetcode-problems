class Solution {
    public String convertToTitle(int columnNumber) {
        StringBuilder ans = new StringBuilder();
        while(columnNumber != 0)
        {
            columnNumber--;
            int rem = columnNumber % 26;
            char c = (char)('A' + rem);
            ans.append(c);
            columnNumber /= 26;
        }
        return ans.reverse().toString();
    }
}
//optimize apporach
//Time complexity - o(log26)