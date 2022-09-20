class Solution {
    public int jump(int[] nums) {
        int n = nums.length;
        Integer dp[] = new Integer[n];
        dp[n-1] = 0;
        
        for(int i = n-2; i >= 0 ; --i){
            int ans = Integer.MAX_VALUE;
            for(int j = i+1 ; j <= i +  nums[i] && j < n; ++j){
                if(dp[j] != null){
                          ans = Math.min(ans , dp[j]);          
                }
            }
            dp[i] = (ans == Integer.MAX_VALUE) ? null : ans + 1;
        }
        
        return dp[0];
    }
}