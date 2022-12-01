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
    public int findmax(int nums[] , int start, int end){
        int max = nums[start];
        int index = start;
        for(int i = start + 1; i <= end ; ++i){
            if(nums[i] > max){
                max = nums[i];
                index = i;
            }
        }
        return index;
    }
    public TreeNode helper(int[] nums, int start, int end){
        if(start > end){
            return null;
        }
        if(start == end){
            return new TreeNode(nums[start]);
        }
        
        int index = findmax(nums, start, end);
        TreeNode fresh = new TreeNode(nums[index]);
        fresh.left = helper(nums, start , index - 1);
        fresh.right = helper(nums, index + 1, end);
        return fresh;
    }
    public TreeNode constructMaximumBinaryTree(int[] nums) {
        return helper(nums, 0 , nums.length - 1);
    }
}