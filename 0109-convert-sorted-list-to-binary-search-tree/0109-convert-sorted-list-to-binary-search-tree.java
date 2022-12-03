/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
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
    public TreeNode createTree(List<Integer> ans, int start , int end){
        if(start > end){
            return null;
        }
        int mid = start + (end - start) / 2;
        TreeNode fresh = new TreeNode(ans.get(mid));
        fresh.left = createTree(ans, start , mid - 1);
        fresh.right = createTree(ans, mid + 1 , end);
        return fresh;
        
    }
    public TreeNode sortedListToBST(ListNode head) {
        List<Integer> ans = new ArrayList<>();
        while(head != null){
            ans.add(head.val);
            head = head.next;
        }
        
        return createTree(ans, 0, ans.size() - 1);
    }
}