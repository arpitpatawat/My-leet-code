class Solution {
    public int change(int amount, int[] coins) {
        
        int n = coins.length;
        int helper[][] = new int [n+1][amount+1];
        
        for(int i = 1 ; i < helper.length ; ++i){
            helper[i][0] = 1;
        }
        
        /*
        0 1 2 3 4 5  amount
      n 0
       1
       2
       3
       */
        
        for(int i = 1 ; i < n+1; ++i){
            
            for(int j = 1; j < amount+1; ++j){
                
                helper[i][j] = helper[i-1][j];
                
                if(coins[i-1] <= j){
                    helper[i][j] += helper[i][j - coins[i-1]];
                }
            }
        }
        
        return helper[n][amount];
    }
}