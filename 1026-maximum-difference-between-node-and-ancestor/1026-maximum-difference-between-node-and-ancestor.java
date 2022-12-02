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
    int min;
    int max;
    int ans;
    
    Info(int a, int b, int c){
        min = a;
        max = b;
        ans = c;
    }
}
class Solution {
    public Info helper(TreeNode root){
        if(root == null){
            return new Info(-1 ,-1,-1);
        }
        Info left = helper(root.left);
        Info right = helper(root.right);
        if(left.min == -1){
            left.min = root.val;
        }
        if(right.min == -1){
            right.min = root.val;
        }
        if(left.max == -1){
            left.max = root.val;
        }
        if(right.max == -1){
            right.max = root.val;
        }
        int ans = Math.max(Math.max(Math.abs(root.val - left.min) , Math.abs(root.val - left.max)), Math.max(Math.abs(root.val - right.min), Math.abs(root.val - right.max)));
        ans = Math.max(ans , Math.max(left.ans , right.ans));
        int max = Math.max(root.val , Math.max(left.max, right.max));
        int min = Math.min(root.val , Math.min(left.min, right.min));
        
        return new Info(min, max , ans);
        
    }
    public int maxAncestorDiff(TreeNode root) {
        Info xd = helper(root);
        return xd.ans;
    }
}