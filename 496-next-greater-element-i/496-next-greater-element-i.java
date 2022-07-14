class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Stack<Integer> stk = new Stack<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for(int i = nums2.length  - 1; i >= 0 ; --i){
            // clear the stack untill all elements less than num2[i] are removed
            while(!stk.isEmpty() &&  nums2[i] >= stk.peek()){
                stk.pop();
            }
            // take the answer from the stk top element
            if(stk.size() > 0){
                map.put(nums2[i] , stk.peek());
            }
            else {
                map.put(nums2[i] , -1);
            }
            
            // put the nums[2] in the stack
            stk.push(nums2[i]);
        }
        
        int ans[] = new int[nums1.length];
        
        for(int i  = 0 ; i < nums1.length ; ++i){
            ans[i] = map.get(nums1[i]);
        }
        return ans;
        
    }
}