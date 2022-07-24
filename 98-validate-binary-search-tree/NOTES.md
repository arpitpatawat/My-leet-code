/**
* Definition for a binary tree node.
* public class TreeNode {
*     int val;
*     TreeNode left;
*     TreeNode right;
*     TreeNode() {}
*     TreeNode(int val) { this.val = val; }
*     TreeNode(int val, TreeNode left, TreeNode right) {
*         this.val = val;
*         this.left = left;
*         this.right = right;
*     }
* }
*/
​
class Pair{
long r1;
long r2;
Pair(long r1 , long r2){
this.r1 = r1;
this.r2 = r2;
}
}
class Solution {
public boolean check(TreeNode root , Pair p){
if(root == null) return true;
if(root.val >= p.r2 || root.val <= p.r1) return false;
Pair p1 = new Pair(p.r1 , root.val);
boolean x = check(root.left , p1);
if(!x) return false;
Pair p2 = new Pair(root.val , p.r2);
boolean y = check(root.right , p2);
return (x && y);
}
public boolean isValidBST(TreeNode root) {
if(root == null) return true;
return check(root ,new Pair(Long.MIN_VALUE - 1, Long.MAX_VALUE  + 1));
}
}