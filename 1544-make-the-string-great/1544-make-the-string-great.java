class Solution {
    public String makeGood(String s) {
        Stack<Character> st = new Stack<>();
        
        for(int i = 0 ; i < s.length() ; ++i){
            if(st.isEmpty()){
                st.push(s.charAt(i));
            }
            else if(st.peek() == (char) (s.charAt(i)^32)){
                st.pop();
            }
            else{
                st.push(s.charAt(i));
            }
            
        }
        
        // reverse order me string hai
        int index = st.size();
        char temp[] = new char[st.size()];
        for(int i = index - 1 ; i >= 0 ; --i){
            temp[i] = st.pop();
        }
        
        return new String(temp);
    }
}