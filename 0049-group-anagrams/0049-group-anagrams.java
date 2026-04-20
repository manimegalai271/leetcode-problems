class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> ans = new ArrayList<>();
        int[] prime = {2,3,5,7,11,13,17,19,23,29,31,37,41,43,47,53,59,61,67,71,73,79,83,89,97,101};
        Map<Integer,List<String>> map = new HashMap<>();
        for(String str:strs)
        {   
            int mul = 1;
            for(int i = 0;i < str.length();i++)
            {
                mul *= prime[str.charAt(i) - 'a'];
            }
            if(map.containsKey(mul))
            {
               map.get(mul).add(str);
            }
            else 
            {
                map.put(mul,new ArrayList<>());
                map.get(mul).add(str);
            }
        }
        for(List<String> l:map.values())
        {
            ans.add(l);
        }
        return ans;
    }
}