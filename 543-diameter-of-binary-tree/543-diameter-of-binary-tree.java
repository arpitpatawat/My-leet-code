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
    public int maxval(TreeNode root, int[] count){
        if(root == null) return 0;
        if(root.left == null && root.right ==null) return 1;
        int x = maxval(root.left, count);
        int y = maxval(root.right, count);
        count[0] = Math.max(count[0] , x+y);
        return Math.max(x,y)+1;
        
    }
    public int diameterOfBinaryTree(TreeNode root) {
        int count[] = new int[1];
        maxval(root, count);
        return count[0] ;
        
    }
}