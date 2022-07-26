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
class BST{
    private Stack<TreeNode> stk1;
    private Stack<TreeNode> stk2;
    public  BST(TreeNode root){
            stk1 = new Stack<TreeNode>();
            stk2 = new Stack<TreeNode>();
            pushAll(root , true);
            pushAll(root , false);
    }
    
    
    public int next(){
        TreeNode temp = stk1.pop();
        pushAll(temp.right,false);
        return temp.val;
    }
    public int prev(){
        TreeNode temp = stk2.pop();
        pushAll(temp.left , true);
        return temp.val;
    }
    private void pushAll(TreeNode root , boolean reverse){
        if(reverse){
            while(root != null){
                stk2.add(root);
                root = root.right;
            }
        }
        else{
            while(root != null){
                stk1.add(root);
                root = root.left;
            }
        }
    }
}
class Solution {
    public boolean findTarget(TreeNode root, int k) {
        BST b1 = new BST(root); // forward
        // BST b2 = new BST(root , true); // reverse
        int i = b1.next();
        int j = b1.prev();
        while(i < j){
            if(i + j == k) return true;
            else if(i + j < k) {
                i = b1.next();
            }
            else{
                j = b1.prev();
            }
        }
        return false;
        
    }
}