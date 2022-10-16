class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n = nums.length;
        Deque<Integer> temp = new ArrayDeque<>();
        int ans [] = new int[n - k + 1];
        // first window of size k 
        for(int i = 0 ; i < k ; ++i){
            while(temp.size() > 0 && nums[i] > nums[temp.peekLast()]){
                temp.pollLast();
            }
            temp.offerLast(i);
        }
        // System.out.print(temp);
        int index = 0;
        ans[index++] = nums[temp.peekFirst()];
        
        for(int i = k ; i < n ; ++i){
             while(temp.size() > 0 &&  temp.peekFirst() < i - k + 1){
                temp.pollFirst();
            }
            while(temp.size() > 0 && nums[i] > nums[temp.peekLast()]){
                temp.pollLast();
            }
            temp.offerLast(i);
            ans[index++] = nums[temp.peekFirst()];
            
        }
        
        return ans;
    }
}