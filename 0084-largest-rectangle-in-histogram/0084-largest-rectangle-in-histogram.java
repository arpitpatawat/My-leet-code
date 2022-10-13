class Solution {
    public int largestRectangleArea(int[] arr) {
        Stack<Integer> st = new Stack<>();
        int[] nse = new int[arr.length];
        for(int i = nse.length - 1; i >= 0 ; --i){
            while(st.size() > 0 && arr[st.peek()] >= arr[i]){
                st.pop();
            }
            if(st.isEmpty()){
                nse[i] = arr.length;
            }
            else{
               nse[i] = st.peek();
            }
            st.push(i);
        }
        
        st = new Stack<>();
        int pse[] = new int[arr.length];
        for(int i = 0 ; i < pse.length ; ++i){
            while(st.size() > 0 && arr[st.peek()] >= arr[i]){
                st.pop();
            }
             if(st.isEmpty()){
                pse[i] = -1;
            }
            else{
               pse[i] = st.peek();
            }
            st.push(i);
        }
        int res = 0;
        
        for(int i = 0 ; i < arr.length ; ++i){
            int width = nse[i] - pse[i] - 1;
            int area = width * arr[i];
            res = Math.max(res, area);
        }
        
        return res;
    }
}