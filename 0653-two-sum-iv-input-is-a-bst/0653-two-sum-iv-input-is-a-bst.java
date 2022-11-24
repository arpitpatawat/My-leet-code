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
class Iterator_BST{
    Stack<TreeNode> st1;
    Stack<TreeNode> st2;
    
    public Iterator_BST(TreeNode root){
        st1 = new Stack<>();
        st2 = new Stack<>();
        pushAll_left(root);
        pushAll_right(root);
    }
    public void pushAll_left(TreeNode root){
        while(root != null){
            st1.push(root);
            root = root.left;
        }
        return ;
    }
     public void pushAll_right(TreeNode root){
        while(root != null){
            st2.push(root);
            root = root.right;
        }
        return ;
    }
    
    public int next(){
        TreeNode temp = st1.pop();
        pushAll_left(temp.right);
        return temp.val;
    }
    public int prev(){
        TreeNode temp = st2.pop();
        pushAll_right(temp.left);
        return temp.val;
    }
}
class Solution {
    public boolean findTarget(TreeNode root, int k) {
        Iterator_BST it = new Iterator_BST(root);
        int start = it.next();
        int end = it.prev();
        while(start < end){
            // System.out.println(start + "," + end);
            if(start + end == k){
                return true;
            }
            if(start + end < k){
                start = it.next();
            }
            else{
                end = it.prev();
            }
        }
        return false;
    }
}