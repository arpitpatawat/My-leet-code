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
    int count = 0;
private ListNode reverse(ListNode head){
    ListNode prev = null;
    ListNode curr = head;
    while(curr != null){
        ListNode next = curr.next;
        curr.next = prev;
        prev =curr;
        curr = next;
        count++;
    }
    return prev;
}
    
    public int[] nextLargerNodes(ListNode head) {
            head = reverse(head);
            Stack<Integer> stk = new Stack<>();
            int ans[] = new int[count];
            --count;
            while(head != null){
                while(!stk.isEmpty() && stk.peek() <= head.val){
                    stk.pop();
                } 
                if(stk.isEmpty()){
                    ans[count--] = 0;
                }
                else{
                    ans[count--] = stk.peek();
                }
                // index++;
                stk.push(head.val);
                head = head.next;
            }
        return ans;
    }
}