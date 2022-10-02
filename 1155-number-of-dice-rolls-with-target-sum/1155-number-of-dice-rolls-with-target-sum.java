class Solution {
    public int helper(int n, int k, int target, Integer dp[][]){
        if(target == 0 && n == 0){
            return 1;
        }
        if(n > target || k * n < target){
            return 0;
        }
        if(dp[n][target] != null){
            return dp[n][target];
        }
        int ans = 0;
        for(int i  = 1 ; i <= k; ++i){
            if(target >= i){
                
            ans =  (ans +  helper(n-1,k,target - i,dp) ) % 1000000007;
            }
            else{
                break;
            }
            
        }
        dp[n][target] = ans;
        return dp[n][target];
    }
    public int numRollsToTarget(int n, int k, int target) {
        Integer dp[][] = new Integer[n+1][target + 1];
        return helper(n,k,target,dp);
    }
}