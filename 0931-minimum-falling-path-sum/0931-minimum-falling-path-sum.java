class Solution {
    public int mini(int a, int b, int c){
        return Math.min(a, Math.min(b,c));
    }
    
    public int helper(int row, int col,Integer dp[][],  int matrix[][]){
        if(row == matrix.length || col < 0 || col == matrix[0].length){
            return Integer.MAX_VALUE;
        }
        if(dp[row][col] == null){
            
        int val =  matrix[row][col];
        int temp = mini(helper(row+1, col-1,dp,  matrix), helper(row+1,col,dp, matrix), helper(row+1, col+1,dp, matrix));
        if(temp == Integer.MAX_VALUE) temp = 0;
        
        // System.out.println(val);
        dp[row][col] = val + temp;
        }
        return dp[row][col];
    }
    public int minFallingPathSum(int[][] matrix) {
        Integer dp[][] = new Integer[matrix.length][matrix[0].length];
        
        int ans = Integer.MAX_VALUE;
        for(int i = 0; i < matrix.length; ++i){
            int val = helper(0,i,dp ,matrix);
          ans = Math.min(ans,val );
        }
        return ans;
    }
}