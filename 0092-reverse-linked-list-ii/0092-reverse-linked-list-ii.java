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
    private ListNode reverse(ListNode head){
        ListNode curr = head;
        ListNode prev = null;
        while(curr != null){
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode dummy = new ListNode(501);
        dummy.next = head;
        int index = 0;
        ListNode prev = dummy;  // prev node of 
        ListNode start = null;
        ListNode end = null;
        ListNode c = head;
        while(c != null){
            if(index == left - 1){
                start = prev;
            }
            if(index == right - 1){
                end = c;
                break;
            }
            prev = c;
            c = c.next;
            index++;
        }
        if(c == null){
            return head;
        }
        ListNode endnext = end.next;
        ListNode startnext = start.next;
        end.next = null;
        start.next = reverse(start.next);
        startnext.next = endnext;
        return dummy.next;
    }
}