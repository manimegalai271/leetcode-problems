class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if(s1.length() > s2.length())
        {
            return false;
        }
        Map<Character,Integer> need = new HashMap<>();
        Map<Character,Integer> have = new HashMap<>();
        for(int i = 0;i < s1.length();i++)
        {
            char ch = s1.charAt(i);
            if(!need.containsKey(ch)) need.put(ch,0);

            need.put(ch,need.get(ch) + 1);
        }
        int start = 0;
        int end = 0;
        while(end < s2.length())
        {   
            char ch = s2.charAt(end);
            if(!need.containsKey(ch))
            {
               end++;
               start = end;
               have.clear(); 
               continue;
            }
            if(!have.containsKey(ch)) have.put(ch,0);
            
            have.put(ch,have.get(ch) + 1);
            while(have.get(ch) > need.get(ch))
            {   
                char startchar = s2.charAt(start);
                
                have.put(startchar,have.get(startchar) - 1);
                start++;
            }
            int windowsize = end - start + 1;
            if(windowsize == s1.length())
            {
                return true;
            }
            end++;
            
        }
        return false;
    }
}