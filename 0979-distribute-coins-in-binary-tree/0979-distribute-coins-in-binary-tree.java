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
    int node;
    int sum;
    Info(int a, int b){
        node = a;
        sum = b;
    }
}
class Solution {
    int ans;
    public Info helper(TreeNode root){
        if(root == null){
            return new Info(0,0);
        }
        Info left = helper(root.left);
        Info right = helper(root.right);
        
        int node = left.node + right.node + 1;
        int sum = left.sum + right.sum + root.val;
        
        ans += Math.abs(node - sum);
        return new Info(node, sum);
    }
    public int distributeCoins(TreeNode root) {
        ans = 0;
        helper(root);
        return ans;
    }
}