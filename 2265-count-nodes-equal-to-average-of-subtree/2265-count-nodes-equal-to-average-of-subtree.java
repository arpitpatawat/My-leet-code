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
    int nodes;
    int sum;
    Info(int nodes , int sum){
        this.nodes = nodes;
        this.sum = sum;
    }
}
class Solution {
    int ans;
    private Info helper(TreeNode root){
        if(root == null){
            return new Info(0, 0);
        }
        Info left = helper(root.left);
        Info right = helper(root.right);
        int nodes = 1 + left.nodes + right.nodes;
        int sum = root.val + left.sum + right.sum;
        
        if(sum/nodes == root.val){
            ++ans;
        }
        return new Info(nodes , sum);
    }
    public int averageOfSubtree(TreeNode root) {
        ans = 0;
        Info xd = helper(root);
        return ans;
    }
}