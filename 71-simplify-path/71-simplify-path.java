class Solution {
    public String simplifyPath(String path) {
        Stack<String> stk = new Stack<>();
        String ans = "";
        int record = 0;
        for(int i = 0 ; i < path.length(); ++i){
            if(path.charAt(i) == '/')
                continue;
            String temp = ""; // make temp string = 0 everytime
            while(i<path.length() && path.charAt(i) != '/'){
                temp += path.charAt(i);
                ++i;
            }
            switch(temp){
                case ".":
                    // ++i;
                    break;
                case "..":
                    if(!stk.isEmpty()) stk.pop();
                    break;
                default:
                    stk.push(temp);
            }
        }
            
        while(!stk.isEmpty()){
            ans = "/"+ stk.pop() + ans ;
        }
        return (ans.length() == 0 ) ? "/" : ans;
    }
}