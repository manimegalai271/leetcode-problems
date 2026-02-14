class Solution {
    public boolean checkIfPangram(String sentence) {
        int[] alpha = new int[26];
        for(int i = 0;i < sentence.length();i++)
        {
            alpha[sentence.charAt(i) - 'a'] = 1;
        }
        for(int i = 0;i < 26;i++)
        {
            if(alpha[i] == 0)
            {
                return false;
            }
        }
        return true;
    }
}