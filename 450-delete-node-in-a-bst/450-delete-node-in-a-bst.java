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
// helper function will delete that nood and do all the adjustments 

class Solution {
    public TreeNode helper(TreeNode root){
        if(root.right == null) return root.left;
        else if(root.left == null) return root.right;
        else{  // the dangerous case  :-{
            TreeNode leftchild = root.left;
            TreeNode temp = getpred(root.left);
            temp.right = root.right;
            return leftchild;
        }
         
    }
    
    public TreeNode getpred(TreeNode root){
        while(root.right != null){
            root = root.right;
        }
        return root;
    }
    
    public TreeNode deleteNode(TreeNode root, int key) {
        if(root == null) return root;
        if(root.val == key) return helper(root);  // need to check again !
        TreeNode head = root ; // use it at the end 
        while(root != null){
        if(key > root.val){
            if(root.right != null && root.right.val == key){
                root.right = helper(root.right);
                break;
            }
             else{
            // either it is not null or its not = to key 
            root = root.right ;
             }
        }
        else{
            if(root.left != null && root.left.val == key){
                root.left = helper(root.left);
                break;
            }
             else{
            // either it is not null or its not = to key 
            root = root.left ;
             }
        }
        }
        return head;
    }
}