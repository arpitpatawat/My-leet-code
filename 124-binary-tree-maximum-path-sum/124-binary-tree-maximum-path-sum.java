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
    int findPath(TreeNode root , int[] ans){
        if(root == null) return 0;
        
        int left = findPath(root.left , ans);
        int right = findPath(root.right , ans);
        
        int temp = Math.max(Math.max(left , right) + root.val, root.val);   //modified kadane's algo
        int rv = Math.max(temp , root.val + left + right);
        ans[0] = Math.max(rv , ans[0]);
        return temp;
    }
    public int maxPathSum(TreeNode root) {
        int ans[] = new int[1];
        ans[0] = Integer.MIN_VALUE;
        // maxpathsum mere ko path return krega jo ki max hai 
        //ans sabse bade vaale path ki value store krega
        int x = findPath(root , ans);
        return ans[0];
    }
}