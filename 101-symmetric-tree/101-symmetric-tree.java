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
    public boolean helper(TreeNode r1 , TreeNode r2){
        if(r1 == null && r2 ==null) return true;
        // System.out.println("checked");
        if((r1 == null && r2 != null) || (r2 == null && r1 != null) || r1.val != r2.val){
            return false;
        }
       return helper(r1.left, r2.right) && helper(r1.right, r2.left);
    }
    public boolean isSymmetric(TreeNode root) {
        return helper(root.left ,root.right);
    }
}