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
    private ListNode merge2Lists(ListNode l1, ListNode l2){
        ListNode fakeHead = new ListNode(0);
        ListNode curr = fakeHead;
        while(l1 != null && l2 != null){
          if(l1.val < l2.val){
              curr.next = l1;
              l1 = l1.next;
          }  
          else{
              curr.next = l2;
              l2 = l2.next;
          }
            curr= curr.next;
        }
        if(l1 == null){
            curr.next = l2;
        }
        else{
            curr.next  = l1;
        }
        
        return fakeHead.next;
    }
    public ListNode mergeKLists(ListNode[] lists) {
        
        if(lists.length == 0 ){
            return null;
        }
        // TODO : base case for empty lists
        
        int n = lists.length;
        ListNode temp = lists[0]; 
        for(int i = 1; i < n; ++i){
            temp = merge2Lists(temp, lists[i]);
        }
        return temp;
    }
}