class Solution {
    public int reverse(int x) {
        if(x == 0) return 0;
        boolean minus = false;
        if(x < 0){
            minus = true;
            x = x * -1;
        }
        while(x % 10 == 0){
            x = x/10;
        }
        long ans = 0;
        int n = (int) (Math.log10(x) + 1) ;
        
        for(int i = 0; i < n; ++i){
            ans = ans*10 + Long.valueOf(x % 10);
            x = x/10;
        }
        if(ans > Long.valueOf(Integer.MAX_VALUE)){
            return 0;
        }
        if(minus){
            ans = ans * -1;
        }
        
        
        return (int) ans;        
    }
}