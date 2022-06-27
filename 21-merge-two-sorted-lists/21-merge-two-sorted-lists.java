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
    public ListNode mergeTwoLists(ListNode head1, ListNode head2) {
        // 4 pointer needed - 1) head 2) 2 nodes for traversing each list 3)a tail pointer which will link to smallest node
        // Case 1 : atleast one of them is null ->
        if(head1 == null) return head2;
        if(head2 == null) return head1;
        
        // Case 2 : Deciding head of the final linked list ->
        ListNode head = null; ListNode tail = null;
        if(head1.val <= head2.val) {head = tail = head1; head1 = head1.next;}
        else {head = tail = head2; head2 = head2.next;}
        // PS: i have also moved head pointer so that i can do rest procedure clearly
        
        // Case 3 : Sorting and Merging Process ->
        while(head1 != null && head2 != null){
            if(head1.val < head2.val){
                tail.next = head1;
                tail = tail.next;
                head1 = head1.next;
            }
            else{
                tail.next = head2;
                tail = tail.next;
                head2 = head2.next;
            }
        }
        
        // Case 4 : when one of the list is finished 
        // this condition will always occur becasue one pointer will be ahead of another 
        if(head1 == null) tail.next = head2;
        else tail.next = head1;
        return head;
    }
}