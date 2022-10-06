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
    public ListNode oddEvenList(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }
        
        ListNode oddStart = head;
        ListNode evenStart = head.next;
        ListNode temp1 = evenStart;
        ListNode temp2 = null;
        while(oddStart != null && evenStart != null){
            oddStart.next = evenStart.next;
            if(oddStart.next == null){
                temp2 = oddStart;
                break;
            }
            oddStart = oddStart.next;
            temp2 = oddStart;
            evenStart.next = oddStart.next;
            evenStart = evenStart.next;
            
        }
        temp2.next = temp1;
        return head;
    }
}