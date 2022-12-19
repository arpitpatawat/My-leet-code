if(s.equals("+")){
int n1 = stk.pop();
int n2 = stk.pop();
stk.push(n1 + n2);
}
else if(s.equals('-')){
int n1 = stk.pop();
int n2 = stk.pop();
stk.push(n1 - n2);
}
else if(s.equals("*")){
int n1 = stk.pop();
int n2 = stk.pop();
stk.push(n1 + n2);
}
else if(s.equals("/")){
}
else{
stk.push(Integer.valueOf(s));
}