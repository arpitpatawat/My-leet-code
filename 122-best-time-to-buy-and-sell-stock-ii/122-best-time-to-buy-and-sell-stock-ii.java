class Solution {
    public int maxProfit(int[] prices) {
        int min = prices[0];
        int sum = 0;
        int fsum  = 0;
        for(int i =1 ; i < prices.length; i++){
            if(prices[i] > prices[i-1] ){
                sum = Math.max(sum,prices[i] - min);
            }
            else {
                min = prices[i];
                fsum = fsum + sum;
                sum = 0;
            }
        }
        if(sum !=0 )return fsum + sum;
        return fsum;
        
    }
}