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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
     List<List<Integer>> ans  = new ArrayList<>();
     if(root == null) return ans;
     Deque<TreeNode> dq = new  ArrayDeque<>();
     dq.offerFirst(root);
     boolean flag = true; // jab true toh pollfirst , jab false to polllast
     while(dq.size() > 0){
         int count = dq.size();
         List<Integer> temp = new ArrayList<>();
         for(int i = 0 ; i < count ; ++i){
             
                 if(flag){
                     TreeNode alpha = dq.pollFirst();
                     temp.add(alpha.val);
                     if(alpha.left != null) {
                         dq.offerLast(alpha.left);
                     }
                     if(alpha.right != null) {
                         dq.offerLast(alpha.right);
                     }
                     
                     }
                 else {
                     TreeNode alpha = dq.pollLast();
                     temp.add(alpha.val);
                     if(alpha.right != null) {
                         dq.offerFirst(alpha.right);
                     }
                    if(alpha.left != null) {
                         dq.offerFirst(alpha.left);
                     }
                    
                    }
             
             
         }
         flag = !flag;
         ans.add(temp);
     }
     return ans;
    }
}