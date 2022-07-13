class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
       Deque<Integer> dq = new ArrayDeque<>();
       /// i have to maintain size of k everytime
        int n  = nums.length;
        int arr[] = new int[n-k+1];
        //let's make a sliding windwow
        for(int i = 0 ; i < k ; ++i){
            while(!dq.isEmpty() && nums[i] >= nums[dq.peekLast()]){
                dq.pollLast();
            }
            dq.offerLast(i);
        }
       
        int index = 0;
        arr[index++] = nums[dq.peekFirst()];
        
        // sliding the window
        for(int i = k; i < n; ++i){
            // removing the element whose index is less than current index
            while(!dq.isEmpty() && i-k + 1 > dq.peekFirst()){
                dq.pollFirst();
            }
            while(!dq.isEmpty() && nums[i] >= nums[dq.peekLast()]){
                dq.pollLast();
            }
            dq.offerLast(i);
             arr[index++] = nums[dq.peekFirst()];
        }
        
            return arr;
        
    }
}


/* TLE solution 
 int n = nums.length;
        int op[] = new int[n-k+1];
     for(int i = 0 ; i < n - k + 1 ; ++i){
         int max = nums[i];
         for(int j = i+1 ; j < i + k ; ++j ){
             if(nums[j] > max) { max = nums[j];}
         }
         op[i] = max;
     }   
      return op;  
      */