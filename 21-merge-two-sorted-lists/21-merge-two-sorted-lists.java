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
    public ListNode mergeTwoLists(ListNode h1, ListNode h2) {
        // case 1: one of the list is null
          { 
              if(h1 == null){
                return h2;
            }
            if(h2 == null){
                return h1;
            }
          }
        
        // case 2 : deciding head 
        
            ListNode head;
            ListNode tail = null;
            if(h1.val <= h2.val){
                head = h1;
                tail = h1;
                h1 = h1.next;
            }
            else{
                head = h2;
                tail = h2;
                h2 = h2.next;
            }
        
        // case 3: sorting and merging
        {
            while(h1 != null && h2 != null){
                if(h1.val <= h2.val){
                    tail.next = h1;
                    
                    h1 = h1.next;
                }
                else{
                    tail.next =h2;
                    h2 = h2.next;
                }
                tail = tail.next;
            }
        }
        // case 4: if one of the list is finished 
        {
            if(h1 == null){
                tail.next = h2;
            }
            else if(h2 == null ){
                tail.next = h1;
            }
            
        }
        
        return head;
    }
}