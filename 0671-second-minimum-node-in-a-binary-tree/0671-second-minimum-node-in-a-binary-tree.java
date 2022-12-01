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
    long ans;
    public int postorder(TreeNode root){
        if(root == null){
            return -1;
        }
        int left = postorder(root.left);
        int right = postorder(root.right);
        if(left > right){
            ans = Math.min(ans , left);
        }
        else if(right > left){
            ans = Math.min(ans , right);
        }
        
        return root.val;
        
    }
    public int findSecondMinimumValue(TreeNode root) {
        ans = Long.MAX_VALUE;
        postorder(root);
        return (ans == Long.MAX_VALUE) ? -1 : (int)ans;
    }
}