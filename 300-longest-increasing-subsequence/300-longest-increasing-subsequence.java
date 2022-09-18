class Solution {
    public int lengthOfLIS(int[] nums) {
        int dp[] = new int[nums.length];
        
        int omax = 0;
        
        for(int i = 0 ; i < nums.length; ++i){
            int temp = 0;
            for(int j = 0 ; j < i; ++j){
                if(nums[j] < nums[i]){
                    temp = Math.max(temp , dp[j]);
                }
            }
            dp[i] = temp + 1;
            
            omax = Math.max(omax, dp[i]);
        }
        
        return omax;
    }
}