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
    public ListNode removeNthFromEnd(ListNode head, int n) {
     if(head.next == null) return null; 
        ListNode curr = head;
        ListNode fast = head;
        for(int i = 0 ; i < n && fast != null; ++i){
            fast = fast.next;
        }
        // if fast.next == null then i have to remove curr.next 
        // if fast == null then i have to remove head;
        while(fast != null && fast.next != null){
            curr = curr.next;
            fast = fast.next;
        }
        if(fast != null && fast.next == null){
            curr.next = curr.next.next;
        }
        else if(fast == null) return curr.next;
        return head;
    }
}