/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> neighbors;

    public Node() {
        val = 0;
        neighbors = new ArrayList<>();
    }

    public Node(int _val) {
        val = _val;
        neighbors = new ArrayList<>();
    }

    public Node(int _val, ArrayList<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
}
*/

class Solution {

    private Node dfs(Node cur, Map<Node, Node> map) {
        // Create clone node
        Node clone = new Node(cur.val);
        map.put(cur, clone);

        for (Node nei : cur.neighbors) {
            if (map.containsKey(nei)) {
                clone.neighbors.add(map.get(nei));
            } else {
                clone.neighbors.add(dfs(nei, map));
            }
        }
        return clone;
    }

    public Node cloneGraph(Node node) {
        if (node == null) return null;

        Map<Node, Node> map = new HashMap<>();
        return dfs(node, map);  // fixed
    }
}
