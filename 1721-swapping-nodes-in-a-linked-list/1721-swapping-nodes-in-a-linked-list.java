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
    public ListNode swapNodes(ListNode head, int k) {
        ListNode fake = new ListNode(0);
        fake.next = head;
        ListNode a = fake;
        for(int i = 0 ; i < k; ++i){
            a = a.next;
        }
        ListNode temp = a;
        ListNode b = fake;
        while(a != null){
            a = a.next;
            b = b.next;
        }
        int x = temp.val;
        temp.val = b.val;
        b.val = x;
        return head;
        
    }
}