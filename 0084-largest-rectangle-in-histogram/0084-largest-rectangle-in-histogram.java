class Solution {
    public int largestRectangleArea(int[] heights) {
        Stack<Integer> st = new Stack<>();
        
        int ans = 0, i = 0;
        for(i = 0 ; i < heights.length ; ++i){
            while(st.size() > 0 && heights[st.peek()] > heights[i]){
                // operation
                int index = st.pop();
                int width = (st.size() > 0) ? i - st.peek() - 1 : i; 
                int area = heights[index] * width;
                ans = Math.max(ans, area);
            }
            st.push(i);
        }
        while(st.size() > 0 ){
                // operation
                int index = st.pop();
                int width = (st.size() > 0) ? i - st.peek() - 1 : i; 
                int area = heights[index] * width;
                ans = Math.max(ans, area);
            }
        
        return ans;
    }
}