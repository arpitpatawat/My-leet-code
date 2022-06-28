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
    public ListNode reverse(ListNode head){
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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        // l1 = reverse(l1);
        // l2 = reverse(l2);
        ListNode l3 = new ListNode(0);
        ListNode head = l3;
        int carry = 0;
        while( l1 != null && l2 != null){
            l3.next = new ListNode(0);
            l3 = l3.next;
            int sum = (l1.val + l2.val + carry);
            l3.val = (sum) % 10 ;
            // System.out.println(sum);
            carry = (sum) / 10;
            l2 = l2.next;
            l1 = l1.next;
        }
        // if any one of them is not null -
        while(l2 != null){
            l3.next = new ListNode(0);
            l3 = l3.next;
            int sum = l2.val + carry;
            l3.val = (sum) %10 ;
            carry = (sum) / 10;
            l2 = l2.next;      
        }
        while(l1 != null){
            l3.next = new ListNode(0);
            l3 = l3.next;
            int sum = l1.val + carry;
            l3.val = (sum) %10 ;
            carry = (sum) / 10;
            l1 = l1.next;      
        }
        if(carry > 0) l3.next = new ListNode(carry);
        return head.next;
    }
}