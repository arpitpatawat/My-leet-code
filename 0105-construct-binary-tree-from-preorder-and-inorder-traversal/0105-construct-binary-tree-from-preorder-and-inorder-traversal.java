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
    int index;
    public TreeNode helper(int[] preorder, int[] inorder, int is, int ie){
        
        if(is > ie){
            return null;
        }
        TreeNode root = new TreeNode(preorder[index++]);
        
        int pos = 0;
        for(int i = is; i <= ie; ++i){
            if(inorder[i] == root.val){
                pos = i;
                break;
            }
        }
        
        root.left = helper(preorder, inorder , is, pos - 1);
        root.right = helper(preorder, inorder , pos + 1, ie);
        
        return root;
    }
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        int is = 0;
        int ie = inorder.length - 1;
        index = 0;
        
        return helper(preorder, inorder,is,ie);
        // return ;
    }
}