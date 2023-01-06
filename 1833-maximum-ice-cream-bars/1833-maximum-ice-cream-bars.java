class Solution {
    public int maxIceCream(int[] costs, int coins) {
        Arrays.sort(costs);
        int sum = 0;
        int ans = 0;
        for(int i : costs){
            if(sum >= coins) break;
            if(sum + i <= coins){
                ++ans;
                sum += i;
            }
        }
        return ans;
    }
}