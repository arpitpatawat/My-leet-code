class Solution {
    public int minAddToMakeValid(String s) {
        int closing_tag = 0;
        int opening_tag = 0;
        for(int i = 0 ; i < s.length() ; ++i){
            if(s.charAt(i) =='('){
                ++closing_tag;
            }
            else if(closing_tag>0){
                --closing_tag;
            }
            else ++opening_tag;
        }
        return closing_tag + opening_tag;
        
    }
}