class Solution {
    public int threeSumClosest(int[] nums, int target) {
        
        int ans = Integer.MAX_VALUE;
        Arrays.sort(nums);
        
        for(int i = 0 ; i < nums.length - 2; ++i){
            int low = i + 1;
            int high = nums.length - 1;
            int sum = target - nums[i];
            
            while(low < high){
              if( Math.abs(sum - nums[low] - nums[high]) < Math.abs(target- ans)){
                  ans = nums[i] + nums[low] + nums[high];
              }
                
              if(nums[low] + nums[high] > sum){
                  high--;
              }
                else{
                    low++;
                }
            }
            
            
        }
        
        return ans;
        
        
    }
}