class Solution {
    
    public int helper(int n, Integer dp[]){
        if(n == 0 || n == 1){
            return 1;
        }
        
        if(dp[n] != null){
            return dp[n];
        }
        int way1 = helper(n-1,dp);
        int way2 = helper(n-2,dp);
        dp[n] =  way1 + way2;
        return dp[n];
    }
    public int climbStairs(int n) {
        Integer dp[] = new Integer[n+1];
        return helper(n,dp);
    }
}