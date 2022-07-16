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
    public int balance(TreeNode root){
        if(root == null ) return 1;
        // if(root.left == null && root.right == null) reutrn 1;
        if(balance(root.left) == -1 || (balance(root.right) == -1)){
            return -1;
        }
    
        if(Math.abs( balance(root.left) - balance(root.right)) < 2)
            return Math.max(balance(root.left) , balance(root.right)) + 1;
        else return -1;
        
    }
    public boolean isBalanced(TreeNode root) {
        if(balance(root) == -1){
            return false;
        }
        else return true;
    }
}