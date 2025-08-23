class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List> hm = new HashMap<>();
        for(String s:strs)
        {
            char[] ch = s.toCharArray();
            Arrays.sort(ch);
            String key = String.valueOf(ch);
            if(!hm.containsKey(key))
            {
                hm.put(key,new ArrayList());
            }
            hm.get(key).add(s);
        }
        return new ArrayList(hm.values());
    }
}