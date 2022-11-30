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
class Info{
    int sum;        // sum of left and right child
    int diff;       // abs diff of left and right child
    Info(int a, int b){
        this.sum = a;
        this.diff = b;
    }
}
class Solution {
    private Info helper(TreeNode root){
        if(root == null){
            return new Info(0,0);
        }
        
        Info left = helper(root.left);
        Info right = helper(root.right);
        int sum,diff = 0;
        sum = root.val + left.sum + right.sum;
        diff = left.diff + right.diff + Math.abs(left.sum - right.sum);
        return new Info(sum,diff);
    }
    public int findTilt(TreeNode root) {
        Info xd = helper(root);
        return xd.diff;
    }
}