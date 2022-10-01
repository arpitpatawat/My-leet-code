class Solution {
    public int numDecodings(String s) {
        int dp[] = new int[s.length() + 1];
        dp[s.length()] = 1;
        
        for(int i = s.length() - 1; i>= 0; --i){
            if(s.charAt(i) == '0'){
                dp[i] = 0;
            }
            else{
                int way1 = dp[i + 1];
                int way2 = 0;
                if(i != s.length() - 1 && Integer.parseInt(s.substring(i, i+2)) <= 26){
                    way2 = dp[i+2];
                }
                dp[i] = way1 + way2;
            }
        }
        return dp[0];
    }
}