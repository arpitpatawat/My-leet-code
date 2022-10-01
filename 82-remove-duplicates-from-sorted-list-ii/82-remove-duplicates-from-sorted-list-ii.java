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
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }
        ListNode fakehead = new ListNode(0);
        ListNode prev = fakehead;
        fakehead.next = head;
        ListNode curr = head;
        
        while(curr != null){
            while(curr.next != null && curr.next.val == curr.val){
                curr = curr.next;
            }
            if(prev.next == curr){
                prev = curr;
                curr = curr.next;
            }
            else{
                prev.next = curr.next;
                curr = curr.next;
            }
            
        }
        
        
        return fakehead.next;
        
    }
}