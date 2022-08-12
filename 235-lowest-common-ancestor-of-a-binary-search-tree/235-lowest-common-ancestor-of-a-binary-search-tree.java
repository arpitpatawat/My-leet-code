/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        while(root != null){
        if(root.val == p.val || root.val == q.val){
            return root;
        }
        if((p.val > root.val && q.val < root.val) || (p.val < root.val && q.val > root.val)){
            return root;
        }
        if(root.val > p.val && root.val > q.val){
            root= root.left;
        }
            else{
                root = root.right;
            }
        
        }
        return root;
    }
        
}