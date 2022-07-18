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
public void helper(TreeNode root, ArrayList<List<Integer>> temp , int level){
    if(root == null) return;
    if(level == temp.size()){
        temp.add(new ArrayList<Integer>());
    }
    temp.get(level).add(root.val);
    helper(root.left ,temp , level + 1);
    helper(root.right, temp , level + 1);
}
    public List<Integer> rightSideView(TreeNode root) {
        ArrayList<Integer> ans = new ArrayList<>();
        if(root == null) return ans;
        ArrayList<List<Integer>> temp = new ArrayList<List<Integer>>();
        helper(root, temp , 0);
        for(int i = 0 ; i < temp.size() ; ++i){
            ans.add(temp.get(i).get(temp.get(i).size() - 1));
        }
        return ans;
    }
}