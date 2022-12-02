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
    public boolean remove(TreeNode root, int target){
        if(root == null){
            return false;
        }
        if(root.val == target && root.left == root.right){
            return true;
        }
        
        boolean left = remove(root.left, target);
        if(left) root.left = null;
        boolean right = remove(root.right , target);
        if(right) root.right = null;
        
        if(root.val == target && root.left == root.right){
            return true;
        }
        else {
            return false;
        }
    }
    public TreeNode removeLeafNodes(TreeNode root, int target) {
        if(remove(root, target)) return null;
        return root;
    }
}