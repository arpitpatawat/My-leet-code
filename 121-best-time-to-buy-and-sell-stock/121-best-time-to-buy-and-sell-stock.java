// class Solution {
//     public int maxProfit(int[] prices) {
//      int min = prices[0];
//         int sum = 0;
//         for(int i =1 ; i < prices.length ; i++ ){
//             if(prices[i] > min){
//            sum = Math.max(sum , prices[i] - min);
//             }
//             else min = prices[i];
//         }
//         return sum;
//     }
// }
class Solution {
    public int maxProfit(int[] prices) {
        int lsf = Integer.MAX_VALUE;
        int op = 0;
        int pist = 0;
        
        for(int i = 0; i < prices.length; i++){
            if(prices[i] < lsf){
                lsf = prices[i];
            }
            pist = prices[i] - lsf;
            if(op < pist){
                op = pist;
            }
        }
        return op;
    }
}