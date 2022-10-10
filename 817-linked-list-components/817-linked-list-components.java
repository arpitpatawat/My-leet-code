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
    public int numComponents(ListNode head, int[] nums) {
        Set<Integer> set = new HashSet<>();
    
        for(int i = 0 ; i < nums.length ; ++i){
            set.add(nums[i]);
        }
        
        int ans = 0;
        boolean flag = false;
        while(head != null){
            if(set.contains(head.val)){
                if(flag == true){
                      head = head.next;
                    continue;
                }
                else{
                    flag = true;
                    ans += 1;
                }
            }
            else{
                flag = false;
            }
            
            
            head = head.next;
        }
        return ans;
    }
}