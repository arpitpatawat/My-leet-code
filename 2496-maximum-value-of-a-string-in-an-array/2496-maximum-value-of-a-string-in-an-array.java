class Solution {
    public int check(String s){
            int max_num = 0;
        for(int i = 0 ; i < s.length() ; ++i){
            char x = s.charAt(i);
            if(x >= '0' && x <= '9'){
               continue;
            }
            else {
                return s.length();
            }
        }
        return Integer.valueOf(s);
    }
    public int maximumValue(String[] strs) {
        int ans = 0;
            for(String s : strs){
                ans = Math.max(ans , check(s));
            } 
        return ans;
    }
}