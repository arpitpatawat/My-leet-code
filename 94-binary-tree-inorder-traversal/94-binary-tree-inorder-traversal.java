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
    public List<Integer> inorderTraversal(TreeNode root) {
        Stack<TreeNode> stk = new Stack<>();
        List<Integer> arr = new ArrayList<>();
        TreeNode curr = root; 
        while(true){
           
            if(curr == null){
                if(stk.isEmpty()) break;
                 
                curr = stk.peek().right;
                arr.add(stk.pop().val);
                
                }
            else{
                stk.push(curr);
                curr = curr.left;
            }
            
        }
    
        return arr;
    }
}