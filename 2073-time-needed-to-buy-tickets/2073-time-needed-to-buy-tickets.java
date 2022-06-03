class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {
        int count = 0;
        for(int i = 0 ; i < tickets.length; ++i){
            if(i <=k){
                count += Math.min(tickets[i], tickets[k]);
            }
            else
                count += Math.min(tickets[i], tickets[k] - 1);
        }
        return count;
    }
}