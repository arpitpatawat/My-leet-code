class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }
        ListNode curr = head.next;
        ListNode prev = head;
        while(curr != null){
            if(curr.val != prev.val){
                prev.next = curr;
                prev = prev.next;
            }
                curr = curr.next;
           
            prev.next = curr;
        }
        return head;
        
    }
}