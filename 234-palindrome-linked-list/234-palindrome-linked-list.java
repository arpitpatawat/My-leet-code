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
    public boolean isPalindrome(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        
        // using floyd's algo to get the middle element
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        
        // for even list, fast -> null , slow -> start of second half
        // for odd list , fast -> last node or != null and slow -> middle of the list, need to push one              node ahead
        if(fast != null) slow = slow.next;
        
        // System.out.println(fast +"," + slow);
        
        // now i ensure that slow in both cases is at correct position.
        slow = reverse(slow);
        // slow will be at the end of list, so fast must be at start for palindrome check.
        fast = head;
        while(fast != null && slow != null){
            if(fast.val != slow.val) return false;
            fast = fast.next;
            slow = slow.next;
        }
        return true;
        
        
    }
}