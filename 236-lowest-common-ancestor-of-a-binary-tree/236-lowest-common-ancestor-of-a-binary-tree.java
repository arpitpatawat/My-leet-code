/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public boolean helper(TreeNode root , int p , Set<Integer> h1){
        if(root == null) return false;
        
        if(root.val == p){
            h1.add(p);
            return true;
        }
        
        if(helper(root.left , p , h1) || helper(root.right , p , h1)){
            h1.add(root.val);
            return true;
        }
        
        return false;
        
    }
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        Set<Integer> h1 = new LinkedHashSet<>();
        Set<Integer> h2 = new LinkedHashSet<>();
      // change void to boolean  
        if(helper( root ,  p.val ,  h1) && helper(root , q.val , h2)){
        int min = Integer.MAX_VALUE;
            if(h1.size() <= h2.size()){
                for(int i : h1){
                    if(h2.contains(i)){
                        min = Math.min(min , i);
                        return new TreeNode(min);
                    }
                }
            }
            else {
                for(int i : h2){
                    if(h1.contains(i)){
                        min = Math.min(min , i);
                        return new TreeNode(min);
                    }
                }
            }
        }
        return root;
        
        
    }
}