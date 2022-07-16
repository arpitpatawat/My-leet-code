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
    int count = 0;
    public int maxval(TreeNode root){
        if(root == null) return 0;
        if(root.left == null && root.right ==null) return 1;
        int x = maxval(root.left);
        int y = maxval(root.right);
        count = Math.max(count , x+y);
        return Math.max(x,y)+1;
        
    }
    public int diameterOfBinaryTree(TreeNode root) {
        maxval(root);
        return count ;
        
    }
}