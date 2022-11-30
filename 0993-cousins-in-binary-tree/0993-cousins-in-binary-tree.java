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
    public boolean isCousins(TreeNode root, int x, int y) {
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        boolean third = false, fourth = false;
        while(q.size() > 0){
            int size = q.size();
            for(int i = 0 ; i < size ; ++i){
                TreeNode temp = q.poll();
                if(temp.left != null && temp.right != null){
                    if((temp.left.val == x || temp.left.val == y ) && (temp.right.val == x || temp.right.val == y)){
                        return false;
                    }
                }
                if(temp.left != null){
                    q.offer(temp.left);
                    if(temp.left.val == x) third = true; 
                    if(temp.left.val == y) fourth = true; 
                }
                if(temp.right != null){
                    q.offer(temp.right);
                    if(temp.right.val == x) third = true; 
                    if(temp.right.val == y) fourth = true;
                }
            }
                if(third && fourth) return true;
                third = fourth = false;
        }
        return false;
    }
}