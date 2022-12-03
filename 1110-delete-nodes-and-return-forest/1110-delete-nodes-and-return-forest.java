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
    private TreeNode preorder(TreeNode root, Set<Integer> set, List<TreeNode> ans){
        if(root == null) return null;
        
        root.left = preorder(root.left, set, ans);
        root.right = preorder(root.right , set, ans);
        
        if(set.contains(root.val)){
            if(root.left != null) ans.add(root.left);
            if(root.right != null) ans.add(root.right);
            return null;
        }
        return root;
    }
    public List<TreeNode> delNodes(TreeNode root, int[] to_delete) {
        List<TreeNode> ans = new ArrayList<>();
        Set<Integer> set = new HashSet<>();
        for(int i : to_delete){
            set.add(i);
        }
        TreeNode last = preorder(root, set, ans);
        if(last != null) ans.add(last);
        return ans;
    }
}