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
    private void helper(TreeNode root, TreeNode parent, TreeNode grand){
        if(root == null){
            return ;
        }
        if(grand != null && grand.val % 2 == 0){
            ans += root.val;
        }
        
        helper(root.left , root, parent);
        helper(root.right, root, parent);
        return ;
    }
    public int sumEvenGrandparent(TreeNode root) {
        ans = 0;
        helper(root , null , null);
        return ans;
        
    }
}