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
class Solution {
    public ListNode mergeNodes(ListNode head) {
        ListNode prev = new ListNode(0);
        ListNode fakehead = prev;
        ListNode curr = head.next;
        while(curr != null){
            
        int ans = 0;
        while(curr.val != 0){
            ans += curr.val;
            curr = curr.next;
        }
        ListNode temp = new ListNode(ans);
        prev.next = temp;
        prev = temp;
        curr = curr.next;
        }
        return fakehead.next;
    }
}