class Solution {
    public int coinChange(int[] coins, int amount) {
        
        int dp[] = new int[amount+1];
        
        // from 1 to 11 fill -1;
        for(int i = 1; i < amount+1; ++i){
            dp[i] = -1;
        }
        
        
        for(int i = 1 ; i < amount + 1 ; ++i){
                int sum = Integer.MAX_VALUE;
                int res = 0;
            for(int j = 0  ; j < coins.length; ++j){
              if(  coins[j] <= i ){
                if(dp[i - coins[j]] == -1){
                     res = -1;
                }
                else{
                    res = 1 + dp[i - coins[j]];
                    sum = Math.min(sum , res);
                }
              }
            
            }
            if(sum == Integer.MAX_VALUE){
                dp[i] = -1;
            }
            else{
                dp[i] = sum;
            }
            
            
        }
        
        return dp[amount];
        
    }
}