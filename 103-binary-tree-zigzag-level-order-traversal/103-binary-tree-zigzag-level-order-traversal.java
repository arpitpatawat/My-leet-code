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

/*
if level is even , add element to list in left to right order
if level is odd , add element to list in right to left order
*/
class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        //DFS se bhi kr skte hai 
        List<List<Integer>> ans = new ArrayList<List<Integer>>();
        DFS(root , ans, 0);        
        return ans;
    }
    public void DFS(TreeNode root , List<List<Integer>> ans, int level){
        // List<Integer> ans = new ArrayList<>();
        if(root == null) return;
        if(level == ans.size()){
            ans.add(new ArrayList<Integer>());
        }
        if(level % 2 == 0) { // even
            ans.get(level).add(root.val);
        }
        else{
            ans.get(level).add(0,root.val);
        }
        DFS(root.left, ans, level+1);
        DFS(root.right, ans ,level+ 1);   
    }
}