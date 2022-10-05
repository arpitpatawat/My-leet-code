class Solution {
    public int climbStairs(int n) {
        if(n == 0 || n == 1){
            return 1;
        }
        int way1 = 1;
        int way2 = 2;
        
        
        
        for(int i = 3; i <= n; ++i){
            int ans = way1 + way2;
            way1 = way2;
            way2 = ans;
        }
        
        return way2;
        
    }
}