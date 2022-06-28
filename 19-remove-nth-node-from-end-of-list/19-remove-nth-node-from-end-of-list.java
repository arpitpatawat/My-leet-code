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
        while( n > 0){
            fast = fast.next;
            --n;
        }
        // if fast.next == null then i have to remove curr.next 
        // if fast == null then i have to remove head;
        if(fast == null) return curr.next;
        while(fast.next != null){
            curr = curr.next;
            fast = fast.next;
        }
         curr.next = curr.next.next;
        return head;
    }
}