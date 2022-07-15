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
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> arr = new ArrayList<>();
        if(root == null) return arr;
        Stack<TreeNode> stk = new Stack<>();
        TreeNode curr = root;
        stk.add(root);
        while(!stk.isEmpty()){
            curr = stk.pop();
           arr.add(curr.val);
           if(curr.right != null){
               stk.push(curr.right);
           }           
            if(curr.left != null){
               stk.push(curr.left);
           }
            
            
            
            
            
        }
        
        return arr;
    }
}