class Solution {
    public int minDistance(String word1, String word2) {
      return word1.length() + word2.length() - 2 * LCS(word1 , word2);  
    }
    
    public int LCS(String s1 , String s2){
        int m = s1.length();
        int n = s2.length();
        
        int helper[][] = new int[m+1][n+1];
        
        for(int i = 1 ; i < m+1 ; ++i){
            for(int j = 1 ; j < n+1 ; ++j){
                if(s1.charAt(i - 1) == s2.charAt(j - 1)){
                    helper[i][j] = 1 + helper[i-1][j-1];
                }
                else{
                    helper[i][j] = Math.max(helper[i-1][j] , helper[i][j-1]);
                }
            }
        }
        
        return helper[m][n];
        
        
    }
}