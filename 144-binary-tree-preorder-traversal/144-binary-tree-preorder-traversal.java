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
    public void preorder(TreeNode root, List<Integer> arr){
       if(root != null){
            arr.add(root.val);
            preorder(root.left , arr);
            preorder(root.right , arr);
        }
        
    }
    public List<Integer> preorderTraversal(TreeNode root) {
        List <Integer> arr = new ArrayList<>();
        preorder(root, arr);
        return  arr;
    }
}