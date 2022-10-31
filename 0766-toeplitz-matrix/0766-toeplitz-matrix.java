class Solution {
    public boolean isToeplitzMatrix(int[][] matrix) {
        int row = matrix.length;
        int col = matrix[0].length;
        for(int i = 0; i < matrix.length; ++i){
            int target = matrix[i][0];
            for(int j = i+1, k = 1 ; j < row && k < col; ++j,++k){
                if(matrix[j][k] != target){
                    return false;
                }
            }
        }
        
        for(int i = 1; i < col; ++i){
            int target = matrix[0][i];
            for(int j = i+1 , k = 1 ; j < col && k < row; ++j,++k){
                if(matrix[k][j] != target){
                    return false;
                }
            }
        }
        return true;
    }
}