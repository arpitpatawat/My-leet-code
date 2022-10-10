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
    public ListNode[] splitListToParts(ListNode head, int k) {
        int count = 0;
        ListNode[] ans = new ListNode[k];
        for(ListNode temp = head ; temp != null ;temp = temp.next) count++;
        int overall = count / k;
        int initial = count % k;
        ListNode start = null;
        ListNode end = head;
        for(int i = 0 ; i < k && head != null; ++i){
            if(initial != 0){
                for(int j = 0 ; j < overall + 1; ++j){
                    start = end;
                    end = end.next;
                }
                initial--;
            }
            else{
               for(int j = 0 ; j < overall; ++j){
                    start = end;
                    end = end.next;
                } 
            }
        
                start.next = null;
                ans[i] = head;
                head = end;
        }
        return ans;
    }
}