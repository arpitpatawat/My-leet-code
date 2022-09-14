class Solution {
   // helper = [ -1 , -1, -1 ,-1 ,-1 ,-1 ,-1  ....... 10 terms ] 
    public int DP(int[] coins , int amount , int helper[]){
     
           
        if(amount < 0) return -1;
        if(amount == 0) return 0;
        
        if(helper[amount] == -2){  // i have not visited it before
     
        int sum = 0;
        int f = Integer.MAX_VALUE;
        for(int i = 0 ; i < coins.length ; ++i){
            
            sum = DP( coins, amount - coins[i], helper);
            
            if( sum != -1){
                f = Math.min(sum , f);
            }
        }
         helper[amount] = (f == Integer.MAX_VALUE) ? -1 : 1+f;
        }
        
        return helper[amount];
        
    }
    
    public int coinChange(int[] coins, int amount) {
        int helper [] = new int[amount + 1];
        for(int i = 0 ; i < helper.length ; ++i){
            helper[i] = -2;
        }
        
        return DP(coins , amount , helper);
        
    }
}