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
    private void helper(TreeNode root, int sum, int arr[]){
        if(root == null){
            return ; 
        }
        sum = sum * 2 + root.val;
        if(root.left == null && root.right == null){
            arr[0] += sum;
        }
        helper(root.left , sum, arr);
        helper(root.right , sum, arr);
        sum = sum - root.val;
        sum /= 2;
        return ;
        
    }
    public int sumRootToLeaf(TreeNode root) {
        int arr[] = {0};
        helper(root,0,arr);
        return arr[0];
    }
}