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
    public int search_low(int i,List<Integer> in ){
        if(i < in.get(0)){
            return -1;
        }

        int low = 0;
        int high = in.size() - 1;
        while(low <= high){
            int mid = low + (high - low)/2;
            if(in.get(mid) == i){
                return i;
            }
            else if(i < in.get(mid)){
                high = mid - 1;
            }
            else{
                low = mid + 1;
            }
        }
            return in.get(high);
    }
    
    public int search_high(int i,List<Integer> in ){
        if(i > in.get(in.size() - 1)){
            return -1;
        }
        int low = 0;
        int high = in.size() - 1;
        while(low <= high){
            int mid = low + (high - low)/2;
            if(in.get(mid) == i){
                return i;
            }
            else if(i < in.get(mid)){
                high = mid - 1;
            }
            else{
                low = mid + 1;
            }
        }
            return in.get(low);
    }
    
    
    public void inorder(TreeNode root , List<Integer> in){
        if(root == null){
            return ;
        }
        inorder(root.left, in);
        in.add(root.val);
        inorder(root.right,in);
    }
    public List<List<Integer>> closestNodes(TreeNode root, List<Integer> queries) {
     // in order travel of the tree
     List<Integer> in = new ArrayList<>();
     inorder(root,in);
     List<List<Integer>> ans = new ArrayList<>();
     for(int i : queries){
         List<Integer> temp = new ArrayList<>();
         temp.add(0,search_low(i,in));
         temp.add(1,search_high(i,in));
         ans.add(temp);
     }
        return ans;
    }
}