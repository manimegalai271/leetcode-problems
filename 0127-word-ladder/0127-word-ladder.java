class Solution {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        Set<String> dict = new HashSet<>(wordList);
        if (!dict.contains(endWord)) return 0;

        Queue<String> q = new LinkedList<>();
        q.add(beginWord);
        int level = 1;  // start from 1 because beginWord counts

        while (!q.isEmpty()) {
            int size = q.size();
            for (int k = 0; k < size; k++) {
                String word = q.poll();
                if (word.equals(endWord)) return level;

                char[] arr = word.toCharArray();
                for (int i = 0; i < arr.length; i++) {
                    char old = arr[i];
                    for (char c = 'a'; c <= 'z'; c++) {
                        if (c == old) continue;
                        arr[i] = c;
                        String next = new String(arr);
                        if (dict.contains(next)) {
                            q.add(next);
                            dict.remove(next);
                        }
                    }
                    arr[i] = old; // restore for next iteration
                }
            }
            level++;
        }
        return 0;
    }
}