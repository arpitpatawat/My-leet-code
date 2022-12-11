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
    int ans = Integer.MIN_VALUE;
    public int helper(TreeNode root){
        if(root == null) return 0;
        int left = helper(root.left);
        int right = helper(root.right);
        int max = Math.max(left, right);
        int temp = Math.max(root.val , root.val + max);
        ans = Math.max(ans , Math.max(temp, root.val + left + right));
        return temp;
        
    }
    public int maxPathSum(TreeNode root) {
        helper(root);
        return ans;
    }
}