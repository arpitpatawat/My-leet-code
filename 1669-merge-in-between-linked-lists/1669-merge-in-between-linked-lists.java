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
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        int start = 0;
        ListNode head = list1;
        ListNode temp = null;
        for(int i = 0 ; i < b ; ++i){
            if( i == a - 1){
                temp = list1;
            }
            list1 = list1.next;
        }
        temp.next = list2;
        while(list2.next != null){
            list2 = list2.next;
        }
        list2.next = list1.next;
        return head;
    }
}