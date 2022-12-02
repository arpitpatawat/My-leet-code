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
    public void inorder(TreeNode root, List<Integer> ans){
        if(root == null){
            return ;
        }
        inorder(root.left, ans);
        ans.add(root.val);
        inorder(root.right, ans);
        return ;
    }
    public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
        List<Integer> ans = new ArrayList<>();
        List<Integer> a1 = new ArrayList<>();
        List<Integer> a2 = new ArrayList<>();
        inorder(root1, a1);
        inorder(root2, a2);
        int i = 0 , j = 0;
        while(i < a1.size() && j < a2.size()){
            if(a1.get(i) < a2.get(j)){
                ans.add(a1.get(i));
                ++i;
            }
            else{
                ans.add(a2.get(j));
                ++j;
            }
        }
        if(i == a1.size()){
            for( i = j ; i < a2.size(); ++i){
                ans.add(a2.get(i));
            }
        }
        else if(j == a2.size()){
            for( j = i ; j < a1.size(); ++j){
                ans.add(a1.get(j));
            }
        }
        return ans;
    }
}