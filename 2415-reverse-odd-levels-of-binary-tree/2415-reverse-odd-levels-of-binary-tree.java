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
    public void helper(TreeNode root1 , TreeNode root2 , int val){
        if(root1 == null){
            return ;
        }
        if(val % 2 == 1){
            int temp  = root1.val;
            root1.val = root2.val;
            root2.val = temp;
        }
        helper(root1.left, root2.right, val + 1);
        helper(root1.right , root2.left, val + 1);
        
        return ;
    }
    public TreeNode reverseOddLevels(TreeNode root) {
        helper(root.left, root.right , 1);
        return root;
    }
}