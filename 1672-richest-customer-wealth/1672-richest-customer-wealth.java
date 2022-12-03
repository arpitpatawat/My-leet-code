class Solution {
    public int maximumWealth(int[][] accounts) {
        int max = 0;
        for(int i[] : accounts){
            int sum = 0;
            for(int j : i){
                sum += j;
            }
            max = Math.max(sum , max);
        }
        return max;
    }
}