class Solution {
    public boolean isValid(String s) {
      Stack<Character> stk = new Stack<>();
        boolean res = false;
        if(s.length() < 2) return false;
       for( int i = 0 ; i < s.length() ; ++i){
           
           char temp = s.charAt(i);
           if(temp =='(' || temp =='{' || temp =='[') {stk.push(temp); res = true;}
           else if(temp ==')'){
               if(!stk.empty() && stk.peek() == '(')
                    stk.pop();
               else 
                   return false;
           }
           else if(temp =='}'){
               if(!stk.empty() && stk.peek() == '{')
                stk.pop();
               else
                   return false;
           }
          else if(temp ==']'){
               if (!stk.empty() && stk.peek() == '[')
               stk.pop();
              else return false;
           }
           // System.out.println(stk);
       }
           return stk.empty();
    }
}