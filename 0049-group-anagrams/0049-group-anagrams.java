class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> map = new HashMap<>();
        for(String s:strs)
        {
            char[] ch = s.toCharArray();
            Arrays.sort(ch);
            String key = String.valueOf(ch);
            if(!map.containsKey(key))
            {
               map.put(key,new ArrayList());
            }
            map.get(key).add(s);
        }
        List<List<String>> list = new ArrayList<>();
        for(List<String> l:map.values())
        { 
            list.add(l);

        }
        return list;
    }
}