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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        Stack<Integer> st1 = new Stack<>();
        Stack<Integer> st2 = new Stack<>();
        while(l1 != null){
            st1.push(l1.val);
            l1 = l1.next;
        }
        while(l2 != null){
            st2.push(l2.val);
            l2 = l2.next;
        }
        int sum = 0;
        ListNode temp = new ListNode(0);
        while(!st1.isEmpty() || !st2.isEmpty() ){
            if(!st1.isEmpty()) sum += st1.pop();
            if(!st2.isEmpty()) sum += st2.pop();

            temp.val = sum%10;
            sum = sum/10;
            ListNode res = new ListNode(sum);
            res.next = temp;
            temp = res;
        }
        
        return (temp.val == 0) ? temp.next : temp;
    }
}