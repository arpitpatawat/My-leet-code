class Solution {
    public int minAddToMakeValid(String s) {
        Stack<Character> stk = new Stack<>();
        for(int i = 0 ; i < s.length() ; ++i){
            if(s.charAt(i) ==')' && !stk.isEmpty() && stk.peek() =='('){
                stk.pop();
                // continue;
            }
            else 
            stk.push(s.charAt(i));
           
        }
        return stk.size();
    }
}