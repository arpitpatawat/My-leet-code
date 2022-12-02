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
    public TreeNode helper(TreeNode root){
        if(root == null){
            return null;
        }
        TreeNode left = helper(root.left);
        TreeNode right = helper(root.right);
        if(left == null){
            root.left = null;
        }
        if(right == null){
            root.right = null;
        }
        
        return (root.val == 1 || left != null || right!= null) ? root : null;
    }
    public TreeNode pruneTree(TreeNode root) {
        return helper(root);
        
    }
}