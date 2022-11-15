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

    public int goleft(TreeNode root) {
        int count = 1;
        while (root.left != null) {
            root = root.left;
            ++count;
        }
        return count;
    }

    public int goright(TreeNode root) {
        int count = 1;
        while (root.right != null) {
            root = root.right;
            ++count;
        }
        return count;
    }

    public int countNodes(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int left = goleft(root);
        int right = goright(root);
        // System.out.println(left);
        // System.out.println(right);
        int ans = 0;
        if (left != right) {
            ans =1 + countNodes(root.left) + countNodes(root.right);
        }
        else{
            
        ans =  (int) Math.pow(2,left) - 1;
        }
                // System.out.println(root.val + "," + ans);
        return ans;

    }
}
