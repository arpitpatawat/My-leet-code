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
    public boolean compareNode(TreeNode root , TreeNode subRoot){
        if(root == null || subRoot == null){
            return (root == subRoot);
        }
        if(root.val != subRoot.val){
            return false;
        }
        return(compareNode(root.left , subRoot.left) && compareNode(root.right, subRoot.right));
    }
    public void findNode(TreeNode root , TreeNode subRoot , int ans[]){
        if(root == null) return ;
        if(root.val == subRoot.val){
         if(compareNode(root , subRoot)){
                ans[0] = 1;
            }
        }
        findNode(root.left , subRoot , ans);
        findNode(root.right , subRoot , ans);
        
    }
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        int ans[] = new int[1];
        findNode(root , subRoot , ans );
        return (ans[0] == 1) ? true : false;
    }
}