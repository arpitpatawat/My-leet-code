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
    int ans;
    public void helper(TreeNode root, int value){
        if(root == null){
            return ;
        }
        if(root.val >= value){
            ++ans;
            value = root.val;
        }
        helper(root.left, value);
        helper(root.right, value);
        
    }
    public int goodNodes(TreeNode root) {
        ans = 0;
        helper(root, Integer.MIN_VALUE);
        return ans;
    }
}