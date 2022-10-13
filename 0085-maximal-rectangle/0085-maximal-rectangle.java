class Solution {
    private int histogram(char[] heights) {
        int len = heights.length;
        Stack<Integer> s = new Stack<>();
        int maxArea = 0;
        for (int i = 0; i <= len; i++){
            int h = (i == len ? 0 : heights[i] - '0');
            if (s.isEmpty() || h >= (heights[s.peek()] - '0')) {
                s.push(i);
            } else {
                int tp = s.pop();
                maxArea = Math.max(maxArea, (heights[tp] - '0') * (s.isEmpty() ? i : i - 1 - s.peek()));
                i--;
            }
        }
        return maxArea;
    }
    
    
    public int maximalRectangle(char[][] matrix) {
        int ans = 0;
            char temp[] = matrix[0];
        for(int i = 0 ; i < matrix.length ; ++i){
                if(i == 0){
                   ans =  histogram(temp);
                    continue;
                }
            for(int j = 0 ; j < matrix[0].length; ++j){
                temp[j] = (matrix[i][j] == '0') ? '0' : (char) (temp[j] + 1);
            }
                ans = Math.max(histogram(temp) , ans);
            
            
        }
        return ans;
    }
}