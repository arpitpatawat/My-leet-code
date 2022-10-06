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
        if(head == null || head.next == null){
            return head;
        }
        
        ListNode prev = null;
        ListNode curr = head;
        while(curr != null){
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        
        return prev;
        
    }
    public ListNode reverseKGroup(ListNode head, int k) {
        if(head == null || head.next == null){
            return head;
        }
        
        ListNode dummy = new ListNode(0);
        ListNode prev = dummy;
        // handle the first k nodes explictly 
        
        ListNode start = head;
        while(start != null){
            
        ListNode end = start;
        
        for(int i = 0 ; i < k-1 && end != null ; ++i){
            end = end.next;
        }
        if(end == null){
            prev.next = start;
            return dummy.next;
        }
        ListNode endNext = end.next;
        end.next = null;
        prev.next = reverse(start);
        prev = start;
        start = endNext;
        }
        return dummy.next;
    }
}