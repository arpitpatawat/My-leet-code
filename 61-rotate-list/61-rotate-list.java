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
    public ListNode rotateRight(ListNode head, int k) {
       if(head == null || head.next == null || k == 0){
            return head;
        }
        
        int count = 1;
        ListNode temp = head;
        while(temp.next != null){
            temp = temp.next;
            count++;
        }
        if(k%count == 0){
            return head;
        }
        k = k % count;
        ListNode curr = head;
        ListNode mainHead = null;
        for(int i = 0 ; i < count - k - 1 ; ++i){
            curr = curr.next;
        }
        mainHead = curr.next;
        curr.next = null;
        temp.next = head;
        return mainHead; 
    }
}