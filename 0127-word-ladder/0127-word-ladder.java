

class Solution {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        Set<String> dict = new HashSet<>(wordList);
        if (!dict.contains(endWord)) return 0; // no possible path

        Queue<String[]> q = new LinkedList<>();
        q.add(new String[]{beginWord, "1"});
        dict.remove(beginWord);

        while (!q.isEmpty()) {
            String[] cur = q.poll();
            String word = cur[0];
            int level = Integer.parseInt(cur[1]);

            if (word.equals(endWord)) return level;

            char[] arr = word.toCharArray();
            for (int i = 0; i < arr.length; i++) {
                char old = arr[i];
                for (char c = 'a'; c <= 'z'; c++) {
                    if (c == old) continue;
                    arr[i] = c;
                    String next = new String(arr);
                    if (dict.contains(next)) {
                        q.add(new String[]{next, String.valueOf(level + 1)});
                        dict.remove(next);
                    }
                }
                arr[i] = old; // restore for next iteration
            }
        }
        return 0;
    }
}
