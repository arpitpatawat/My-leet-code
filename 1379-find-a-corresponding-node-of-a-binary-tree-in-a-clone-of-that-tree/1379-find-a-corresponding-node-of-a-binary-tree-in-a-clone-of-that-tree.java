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
    public TreeNode search(TreeNode root, int target){
        if(root == null || root.val == target){
            return root;
        }
        TreeNode left = search(root.left, target);
        TreeNode right = search(root.right , target);
        if(left != null){
            return left;
        }
        else{
            return right;
        }
    }
    public final TreeNode getTargetCopy(final TreeNode original, final TreeNode cloned, final TreeNode target) {
        return search(cloned , target.val);
    }
}