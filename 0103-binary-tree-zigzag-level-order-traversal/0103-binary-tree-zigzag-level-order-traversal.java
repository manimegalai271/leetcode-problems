/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        if(root == null) return ans;
        Queue<TreeNode> q = new LinkedList();
        q.add(root);
        Boolean lefttoright = true;
        while(!q.isEmpty())
        {
            List<Integer> curr = new ArrayList<>();
            int size = q.size();
            for(int i = 0; i < size;i++)
            {
                TreeNode currelement = q.poll();
                if(lefttoright)
                {
                  curr.add(currelement.val);
                }
                else 
                {
                    curr.add(0,currelement.val);
                }
                if(currelement.left != null)
                {
                    q.add(currelement.left);
                }
                if(currelement.right != null)
                {
                    q.add(currelement.right);
                }
            }
            ans.add(curr);
            lefttoright = !lefttoright;
            
        }
        return ans;
    }
}