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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<List<Integer>>();
        if(root == null) return ans;
        // System.out.println("ddw");
        Queue<TreeNode> q = new ArrayDeque<>();
        q.offer(root);
        while(!q.isEmpty()){
            List<Integer> arr = new ArrayList<>();
            int x = q.size();
            for(int i = 0 ; i < x ; ++i){
                TreeNode temp = q.poll();
                arr.add(temp.val);
                if(temp.left != null) q.offer(temp.left);
                if(temp.right != null) q.offer(temp.right);
            }
            ans.add(arr);
        }
        
        
        return ans;
    }
}