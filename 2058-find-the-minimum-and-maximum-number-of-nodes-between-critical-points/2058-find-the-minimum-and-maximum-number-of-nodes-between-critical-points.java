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
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        ListNode prev = head;
        ListNode curr = head.next;
        ListNode next = curr.next;
        int start = -1;
        int end = -1;
        int max = -1;
        int min = Integer.MAX_VALUE;
        int index = 1;
        while(next != null){
            
            if((curr.val > prev.val && curr.val > next.val) || (curr.val < prev.val && curr.val < next.val)){
                if(start == -1){ // first start
                    start = index;
                    max = index;
                }
                else if(end == -1){
                    end = index;
                    min = Math.min(end - start , min);
                }
                else{
                    start = end;
                    end = index;
                    min = Math.min(end - start , min);
                }
            }
            
            
            prev = curr;
            curr = next;
            next = next.next;
            ++index;
        }
        
        if(end == -1){
            return new int[]{-1,-1};
        }
        else{
            return new int[]{min,end-max};
        }
    }
}