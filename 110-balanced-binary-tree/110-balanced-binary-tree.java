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
        if(root == null ) return 0;
        // if(root.left == null && root.right == null) reutrn 1;
        int x = balance(root.left);
        if(x == -1 ){
            return -1;
        }
        int y = balance(root.right);
        if(y == -1 ){
            return -1;
        }
        if(Math.abs(x - y) < 2)
            return Math.max(x , y) + 1;
        else return -1;
        
    }
    public boolean isBalanced(TreeNode root) {
        if(balance(root) == -1){
            return false;
        }
        else return true;
    }
}