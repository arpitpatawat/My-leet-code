class Solution {
    public int maxProfit(int[] prices) {
        int min = prices[0];
        int sum = 0;
        // int max = Integer.MIN_VALUE;
        for(int i = 1 ; i < prices.length; ++i){
            if(prices[i] > min){
                sum = Math.max(sum , prices[i] - min);
            }
            else{
                min = prices[i];
            }
        }
        return sum;
    }
}