class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stk = new Stack<>();
        for(String s : tokens){
           switch(s){
               case "+" : {
                   int n1 = stk.pop();
                   int n2 = stk.pop();
                   stk.push(n1 + n2);
                   break;
               }
               case "-" : {
                   int n1 = stk.pop();
                   int n2 = stk.pop();
                   stk.push(n2 - n1);
                   break;
               }
                case "*" : {
                   int n1 = stk.pop();
                   int n2 = stk.pop();
                   stk.push(n1 * n2);
                   break;
               }
               case "/" : {
                   int n1 = stk.pop();
                   int n2 = stk.pop();
                   stk.push(n2 / n1);
                   break;
               }
                default : {
                    stk.push(Integer.valueOf(s));
                    break;
                }
           }
        }
            return stk.pop();
    }
}