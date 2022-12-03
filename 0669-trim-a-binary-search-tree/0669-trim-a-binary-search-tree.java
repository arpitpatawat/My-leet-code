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
    public TreeNode trimBST(TreeNode root, int low, int high) {
        return preorder(root, low, high); 
    }
    private TreeNode delete(TreeNode root){
        if(root.left == root.right){
            return null;
        }
        else if(root.left != null && root.right == null){
            return root.left;
        }
        else if(root.right != null && root.left == null){
            return root.right;
        }
        else{
            TreeNode prev = null;
            TreeNode temp = root.left;
            while(temp.right != null){
                prev = temp;
                temp = temp.right;
            }
            root.val = temp.val;
            prev.right = delete(temp);
            return root;
        }
    }
    private TreeNode preorder(TreeNode root, int low, int high){
        if(root == null) return null;
        
        root.left = preorder(root.left, low, high);
        root.right = preorder(root.right , low, high);
        
        if(root.val < low || root.val > high){
            return delete(root);
        }
        return root;
    }
    
}