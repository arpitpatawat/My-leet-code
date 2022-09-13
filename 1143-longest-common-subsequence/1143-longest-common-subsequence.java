class Solution {
    public static int LCS(String s1 , String s2 , int m , int n, int helper[][]){
        if(m == -1 || n == -1){
            return 0;
        }
        
        if(helper[m][n] == -1){
            if(s1.charAt(m) == s2.charAt(n)){
                helper[m][n] = 1 +  LCS(s1 , s2 , m-1 , n-1 , helper);
            }
            else{
                helper[m][n] = Math.max(LCS(s1 , s2 , m-1 , n , helper) , LCS (s1 , s2 , m , n- 1 , helper));
            }
            
        }
        return helper[m][n];
        
    }
    public int longestCommonSubsequence(String text1, String text2) {
        int m = text1.length();   // m = 5
        int n = text2.length();   // n = 3
        int helper[][] = new int[m][n];  // 5 X 3
        for(int i = 0 ; i  < m ; ++i){  
            for(int j = 0 ; j < n ; ++j){
                helper[i][j] = -1;
            }
        }
        
        return LCS(text1 , text2 , m-1 , n-1 , helper); // 4 , 2
    }
}