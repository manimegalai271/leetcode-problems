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
    public int maxLevelSum(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        //if(root == null) return null;
        Queue<TreeNode> q = new LinkedList();
        q.add(root);
        while(!q.isEmpty())
        {
            List<Integer> curr = new ArrayList<>();
            int size = q.size();
            for(int i = 0; i < size;i++)
            {
                TreeNode currelement = q.poll();
                curr.add(currelement.val);
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
        }
        List<Integer> max = new ArrayList<>();
        for(List<Integer> curr:ans)
        {
            int sum = 0;
            for(int c:curr)
            {
                sum = sum+c;
            }
            max.add(sum);
        }
        int m = Integer.MIN_VALUE;
        int level = 0;
        int i = 1;
        for(int mm:max)
        {
            if(mm > m)
            {
                m = mm;
                level = i;
            }
            i++;

        }
        return level;
    }
}