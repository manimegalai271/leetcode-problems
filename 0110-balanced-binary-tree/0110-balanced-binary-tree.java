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
    public boolean isBalanced(TreeNode root) {
    if (root == null) return true;

    int[] height = new int[]{1};
    bst(root, height);
    return height[0] == 1;
}

public int bst(TreeNode root, int[] height) {
    if (root == null) return 0;
    int left = bst(root.left, height) + 1;
    int right = bst(root.right, height) + 1;

    if (Math.abs(right - left) > 1) height[0] = 0;
    return Math.max(left, right);
}
}