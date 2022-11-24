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
    int index ; // global variable
    public TreeNode helper(int[] preorder, int upper_limit){
    if(index >= preorder.length || preorder[index] > upper_limit){
        return null;
    }
        int curr_limit = preorder[index];
        TreeNode fresh = new TreeNode(preorder[index]);
        index += 1;
        fresh.left = helper(preorder, curr_limit);
        fresh.right = helper(preorder,upper_limit);
        return fresh;
        
    }
    
    
    public TreeNode bstFromPreorder(int[] preorder) {
        index = 0;
        return helper(preorder, Integer.MAX_VALUE);
        
    }
}