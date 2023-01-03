class Solution {

    public int minDeletionSize(String[] strs) {
        if(strs.length == 1) return 0;
        int ans = 0;
        int n = strs.length;
        int m = strs[0].length();
        for(int i = 0 ; i < m ; ++i){
              
              for(int j = 1; j < n ; ++j){
                  boolean temp = (strs[j-1].charAt(i) - strs[j].charAt(i) > 0) ? true : false ; 
                  
                  if(temp) {
                      ++ans;
                      break;
                  }
              }
        }
        return ans;
    }
}