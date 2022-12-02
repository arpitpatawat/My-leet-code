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
    public TreeNode createBinaryTree(int[][] desc) {
        HashMap<TreeNode, TreeNode> map = new HashMap<>();
        HashMap<Integer, TreeNode> data = new HashMap<>();
        
        for(int i[] : desc){
            data.put(i[0] , data.getOrDefault(i[0], new TreeNode(i[0])));
            data.put(i[1] , data.getOrDefault(i[1], new TreeNode(i[1])));
            TreeNode parent = data.get(i[0]);
            TreeNode child = data.get(i[1]);
            if(i[2] == 1){
                parent.left = child;
            }
            else{
                parent.right = child;
            }
            map.put(child , parent);
            map.put(parent, map.getOrDefault(parent, null));
        }
        
        for(var entry : map.entrySet()){
            if(entry.getValue() == null){
                return entry.getKey();
            }
        }
        return null;
    }
}