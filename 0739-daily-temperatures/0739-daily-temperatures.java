class Solution {
    public int[] dailyTemperatures(int[] temp) {
        Stack<Integer> stk = new Stack<>();
        int ans[] = new int[temp.length];
        int n = temp.length;
        stk.push(n - 1);
        for(int i = n - 2; i >= 0; --i){
            while(stk.size() > 0 && temp[i] >= temp[stk.peek()]){
                stk.pop();
            }
            if(stk.size() == 0) ans[i] = 0;
            else{
                ans[i] = stk.peek() - i;
            }
            
            stk.push(i);
        }
        return ans;
    }
}