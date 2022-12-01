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
    public void inorder(TreeNode root, ArrayList<Integer> arr){
        if(root == null){
            return ;
        }
         inorder(root.left, arr);
        arr.add(root.val);
        inorder(root.right, arr);
        return ;
    }
    public TreeNode create(ArrayList<Integer> arr, int start , int end){
        if(start > end){
            return null;
        }
        int mid = start + (end - start) / 2;
        TreeNode fresh = new TreeNode(arr.get(mid));
        fresh.left = create(arr, start, mid - 1);
        fresh.right = create(arr, mid + 1, end);
        return fresh;
    }
    public TreeNode balanceBST(TreeNode root) {
        ArrayList<Integer> arr = new ArrayList<>();
        inorder(root , arr);
        return create(arr, 0 , arr.size() - 1);
    }
}