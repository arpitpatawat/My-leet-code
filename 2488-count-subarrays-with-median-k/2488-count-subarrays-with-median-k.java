class Solution {
    public int countSubarrays(int[] nums, int k) {
        int n = nums.length;
        int index = -1;
        
        // mark 1 for element > k , -1 for element < k and 0 for k. 
        for(int i = 0; i < n; ++i){
            if(nums[i] == k){
                nums[i] = 0;
                index = i;          //index of k
            }
            else if(nums[i] > k){
                nums[i] = 1;
            }
            else {
                nums[i] = -1;
            }
        }
        
        // go left 
        Map<Integer, Integer> map = new HashMap<>();
        int sum = 0;
        for(int i = index ; i >= 0 ; --i){
            sum += nums[i];
            map.put(sum , map.getOrDefault(sum, 0) + 1);
        }
        
        
        //go right
         sum = 0;
        int ans = 0;
        for(int i = index; i < n; ++i){
            sum += nums[i];
            // check balance for curr_sum 
            int f = -1 * sum;
            if(map.containsKey(f)){
                ans += map.get(f);
            }
            
            //check balance for curr_sum + 1;
            f += 1;
            if(map.containsKey(f)){
                ans += map.get(f);
            }
            
            
        }    
        return ans;
    }
}