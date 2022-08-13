class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int top = 0;
        int bottom = matrix.length;
        int left = 0;
        int right = matrix[0].length;
        int index = 0;
        List<Integer> ans = new ArrayList<>(bottom * right);
        while(top < bottom && left < right) {
          
            for(int i = left ; i < right ; ++i){
                ans.add(index++ , matrix[top][i]);
            }
            top++;
            
            for(int i = top ; i < bottom ; ++i){
                ans.add(index++ , matrix[i][right - 1]);
               
            }
            right--;
            if(top < bottom){
                
            
            for(int i = right - 1 ; i >= left ; --i){
                ans.add(index++ , matrix[bottom - 1][i]);
                
            }
            }
            bottom --;
            
            if(left < right){
                
            
            for(int i = bottom - 1; i >= top ;--i){
                ans.add(index++ , matrix[i][left]);
            }
            }
            
            left++;
            
           
              
        }
              return ans;
        
        
    }
}