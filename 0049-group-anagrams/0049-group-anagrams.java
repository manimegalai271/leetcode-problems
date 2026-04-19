class Solution {
    public boolean check_anagrams(String s1,String s2)
    {
        int[] freq = new int[26];
        if(s1.length() != s2.length())return false;
        for(int i = 0;i < s1.length();i++)
        {
            freq[s1.charAt(i) - 'a']++;
            freq[s2.charAt(i) - 'a']--;
        }
        for(int i = 0;i < 26;i++)
        {
            if(freq[i] != 0)
            {
                return false;
            }
        }
        return true;
    }
    public List<List<String>> groupAnagrams(String[] strs) {
        boolean[] visited = new boolean[strs.length];
        List<List<String>> ans =  new ArrayList<>();
        for(int i = 0;i < strs.length;i++)
        {   
            if(visited[i])continue;
            List<String> a = new ArrayList<>();
            a.add(strs[i]);
            visited[i] = true;
            for(int j = i + 1;j < strs.length;j++)
            {
                if(!visited[j] && check_anagrams(strs[i],strs[j]))
                {
                    a.add(strs[j]);
                    visited[j] = true;
                }
            }
            ans.add(a);
        }
        return ans;
    }
}