class Solution {
private int convert(String s, int index){
return (s.charAt(index) - '0')*10 + (s.charAt(index+1) - '0');
}
private int helper(String s, int index, Integer dp[]){
if(index == s.length()){
return 1;
}
else if(s.charAt(index) == '0'){
return 0;
}
else if(dp[index] == null){
int way1 = helper(s,index+1,dp);  // take the single digit
int way2 = 0; // take the pair of 2 nums
if((index < s.length() - 1)  &&  convert(s,index) <= 26){
way2 = helper(s,index+2,dp);
}
dp[index] =  way1 + way2;
}
return dp[index];
}
public int numDecodings(String s) {
Integer dp[] = new Integer[s.length()];
return helper(s,0,dp);
}
}