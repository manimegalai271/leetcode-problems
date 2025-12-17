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
    public int getMinimumDifference(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        inorder(ans,root);
        int min = Integer.MAX_VALUE;
        for(int i = 0;i < ans.size() -1;i++)
        {
            min = Math.min(min,ans.get(i+1) - ans.get(i));
        }
        return min;
    }
    public void inorder(List<Integer> ans,TreeNode root)
    {
        if(root == null)
        {
            return;
        }
        inorder(ans,root.left);
        ans.add(root.val);
        inorder(ans,root.right);
    }
}
//Time complexity = o(n)
//space complexity = o(n)