class Solution {
    public int numTrees(int n) {
       
        int dp[] = new int[n+1];
        dp[0] = 1;
        dp[1] = 1;
        for(int i = 2 ; i <= n; ++i){
            int temp = 0;
            for(int j = 0 ; j < i ; ++j){
                temp += dp[j] * dp[i-1-j];
            }
            dp[i] = temp;
        }
        // System.out.println(Arrays.toString(dp));
        return dp[n];
    }
}