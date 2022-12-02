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
    static Map<Integer,List<TreeNode>> map = new HashMap<>(); 
    public void helper(int n){
       if(map.containsKey(n)){
           return ;
       }
        
      
        
        
    }
    public List<TreeNode> allPossibleFBT(int n) {
        if(n %2 == 0){
            return new ArrayList<TreeNode>();
        }
        TreeNode z = new TreeNode(0,null, null);
        map.put(1 , new ArrayList<TreeNode>());
        map.get(1).add(z);
        for(int t = 3; t <= n; t = t + 2){
             map.put(t , new ArrayList<TreeNode>());
       for(int i = 1; i < t; i = i + 2){
           int left = i;
           int right = t - left - 1;
           for(TreeNode j : map.get(left)){
               for(TreeNode k : map.get(right)){
                   TreeNode zero = new TreeNode(0);
                   zero.left = j;
                   zero.right = k;
                   map.get(t).add(zero);
               }
           }
       }
        }
        return map.get(n);
    }
}

