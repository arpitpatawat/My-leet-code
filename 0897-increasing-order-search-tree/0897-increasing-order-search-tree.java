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
    TreeNode prev,head;
    public TreeNode inorder(TreeNode root){
        if(root == null){
            return null;
        }
        inorder(root.left);
        if(head == null){
            head = root;
            prev = root;
        }
        else{
            prev.right = root;
            root.left = null;
            prev = root;
        }
        inorder(root.right);
        return head;
        
    }
    public TreeNode increasingBST(TreeNode root) {
        head = prev = null;
        
        return inorder(root);
    }
}