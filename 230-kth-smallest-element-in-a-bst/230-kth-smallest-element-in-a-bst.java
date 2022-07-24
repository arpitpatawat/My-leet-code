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
    public int kthSmallest(TreeNode root, int k) {
       // need to inorder traversal using morris traversal method 
       // need a count of how many i calculated so far 
       // that's it :)
       int count = 0;
       TreeNode curr = root;
        while(curr != null){
            if(curr.left != null){
                TreeNode prev = curr.left;
                while(prev.right != null && prev.right.val != curr.val){
                    prev = prev.right;
                }
                if(prev.right == null){
                        prev.right = curr;
                        curr = curr.left;
                 }
                 else{
                        ++count;
                        if(count == k) return curr.val;
                        prev.right = null;
                        curr = curr.right;
                }
                
                
            }
            else{
                ++count;
                if(count == k) return curr.val;
                curr = curr.right;
            }
            
            
        }
        return curr.val;
    }
}