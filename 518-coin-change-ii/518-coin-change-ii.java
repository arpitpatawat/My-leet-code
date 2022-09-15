class Solution {
    
    public int DP(int amount , int[] coins, int n, int helper[][]){
        
        if(n < 0) return 0;
        if(amount == 0) return 1;
        
        if(helper[n][amount] == -1){
        int sum = 0;
        sum += DP( amount ,  coins , n - 1, helper);
        if(coins[n] <= amount){
            sum += DP(amount - coins[n], coins , n, helper);
        }
         helper[n][amount] = sum;   
        }
        return helper[n][amount];
    }
    public int change(int amount, int[] coins) {
        int helper[][] = new int[coins.length][amount+1];
        for(int i = 0 ; i < helper.length; ++i){
            for(int j = 0 ; j < helper[0].length; ++j){
                helper[i][j] = -1;
            }
        }
        return DP(amount , coins , coins.length - 1, helper);
    }
}