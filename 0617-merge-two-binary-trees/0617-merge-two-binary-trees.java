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
    public TreeNode mergeTrees(TreeNode root1, TreeNode root2) {
        if(root1 == null && root2 == null){
            return null;
        }
        int sum = 0;
        TreeNode temp = null;
        if(root1 != null && root2 != null){
            sum = root1.val + root2.val;
            temp = new TreeNode(sum);
            temp.left = mergeTrees(root1.left , root2.left);
            temp.right = mergeTrees(root1.right, root2.right);
            return temp;
        }
        else if(root1 != null){
            sum = root1.val;
            temp = new TreeNode(sum);
            temp.left = mergeTrees(root1.left , null);
            temp.right = mergeTrees(root1.right, null);
            return temp;
        }
        else{
            sum = root2.val;
            temp = new TreeNode(sum);
            temp.left = mergeTrees(null , root2.left);
            temp.right = mergeTrees(null, root2.right);
            return temp; 
        }
    }
}