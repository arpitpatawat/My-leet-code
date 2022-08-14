class Solution {
    public void rotate(int[][] matrix) {
        int high = matrix.length - 1;
        int low = 0;
        
        while(low < high){
         for(int i = 0 ; i < matrix.length ; ++i){
             int temp = matrix[low][i]; 
             matrix[low][i] = matrix[high][i];
             matrix[high][i] = temp;
         }    
         low++;
         high--;
        }
        
         low = 0;
         high = 0;
       
            for(int i = low ; i < matrix.length ; ++i){
                for(int j = i + 1; j < matrix.length ; ++j){
                     int temp = matrix[i][j]; 
                     matrix[i][j] = matrix[j][i];
                     matrix[j][i] = temp;
                }
            }

        
        
        return ;
        
    }
}