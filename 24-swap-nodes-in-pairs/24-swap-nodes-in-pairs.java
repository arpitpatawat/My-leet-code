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
    public ListNode swapPairs(ListNode head) {
         if(head == null || head.next == null) return head;
         
        ListNode prev = head;
        ListNode curr = prev.next;
        prev.next = curr.next;
        curr.next = prev;
        ListNode lastprev = prev;
        prev = prev.next;
        ListNode finalhead = curr;
        while(prev != null && prev.next != null){
            curr = prev.next;
            prev.next = curr.next;
            curr.next = prev;
            lastprev.next = curr;
            lastprev = prev;
            prev = prev.next;
        }
        return finalhead;
            
        
        
        
    
        
    }
}