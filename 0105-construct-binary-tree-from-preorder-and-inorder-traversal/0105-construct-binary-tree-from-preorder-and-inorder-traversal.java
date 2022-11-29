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
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        index = 0;
        return helper(preorder, inorder, 0, inorder.length - 1);
    }
    
    public TreeNode helper(int[] preorder, int[] inorder, int start, int end){
        if(start > end){
            return null;
        }
        
        TreeNode head = new TreeNode(preorder[index]);
        int in = 0;
        for(int i = start ; i <= end; ++i){
            if(inorder[i] == preorder[index]){
                in = i;
                index++;
                break;
            }
        }
        
        head.left = helper(preorder, inorder , start , in - 1);
        head.right = helper(preorder, inorder , in+1 , end);
        return head;
    }
}