class Solution {
    public int maxSubArray(int[] nums) {
        
        int maxsum = Integer.MIN_VALUE;
        int curr_sum = 0;
        for(int i = 0 ; i < nums.length ; ++i){
            curr_sum = Math.max(curr_sum + nums[i] , nums[i]);
            maxsum = Math.max(curr_sum , maxsum);
        }
        return maxsum;
    }
}