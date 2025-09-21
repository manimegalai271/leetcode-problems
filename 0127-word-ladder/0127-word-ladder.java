import java.util.*;

class Solution {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        Set<String> dict = new HashSet<>(wordList);
        if (!dict.contains(endWord)) return 0;

        Queue<AbstractMap.SimpleEntry<String, Integer>> q = new LinkedList<>();
        q.add(new AbstractMap.SimpleEntry<>(beginWord, 1));
        dict.remove(beginWord);

        while (!q.isEmpty()) {
            AbstractMap.SimpleEntry<String, Integer> cur = q.poll();
            String word = cur.getKey();
            int level = cur.getValue();

            if (word.equals(endWord)) return level;

            char[] arr = word.toCharArray();
            for (int i = 0; i < arr.length; i++) {
                char old = arr[i];
                for (char c = 'a'; c <= 'z'; c++) {
                    if (c == old) continue;
                    arr[i] = c;
                    String next = new String(arr);
                    if (dict.contains(next)) {
                        q.add(new AbstractMap.SimpleEntry<>(next, level + 1));
                        dict.remove(next);
                    }
                }
                arr[i] = old;
            }
        }
        return 0;
    }
}
