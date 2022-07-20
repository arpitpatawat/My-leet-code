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
class Pair{
    int x; 
    TreeNode y;
    public Pair(int x , TreeNode y){
        this.x = x;
        this.y = y;
    }
}

class Solution {
    public int widthOfBinaryTree(TreeNode root) {
     if(root == null) return 0;
     Queue<Pair> q = new ArrayDeque<>();
     q.offer(new Pair( 0 , root));
     int ans = 0;
     while(!q.isEmpty()){
         int count = q.size();
         int  high = 0;
         
         int min = q.peek().x;
         for(int i = 0 ; i < count ; ++i ){
           
             Pair temp = q.poll();
             int num = temp.x - min;
             TreeNode nd = temp.y;
             high = num;
            
            if(nd.left != null) {
                q.offer(new Pair(2*num + 1, nd.left));
            }
            if(nd.right != null){
                q.offer(new Pair(2*num + 2, nd.right));
            }
        ans = Math.max(ans, high + 1);
         }   
     }    
         
     return ans;    
    }
}