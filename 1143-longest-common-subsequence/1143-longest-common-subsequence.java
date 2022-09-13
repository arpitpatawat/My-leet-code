class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        int m = text1.length();
        int n = text2.length();
        
        int helper[][] = new int[m + 1][n + 1];
        
        // filling the first column 
        for(int i = 0 ; i < m + 1 ; ++i){
            helper[i][0] = 0;
        }
        
        // filling the first row 
        for(int i = 0 ; i < n + 1 ; ++i){
            helper[0][i] = 0;
        }
        
        
        for(int i = 1; i < m + 1 ; ++i){
            for(int j = 1; j < n + 1 ; ++j){
                if(text1.charAt(i - 1) == text2.charAt(j - 1)){
                    helper[i][j] = 1 + helper[i-1][j-1];
                }
                else{
                    helper[i][j] = Math.max(helper[i-1][j] ,helper[i][j-1]);
                }
            }
        }
        
        // for(int i = 0 ; i < m + 1 ; ++i){
        //     for(int j = 0 ; j < n + 1 ; ++j){
        //         System.out.print(helper[i][j] +" ");
        //     }
        //     System.out.println("\n");
        // }
        
        return helper[m][n];
        
    }
}