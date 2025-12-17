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
    public boolean isValidBST(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        inorder(ans,root);
        for(int i =0;i < ans.size()-1;i++)
        {
            if(ans.get(i) >= ans.get(i+1))
            {
                return false;
            }
        }
        return true;
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