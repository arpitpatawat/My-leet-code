class Solution {
public int helper(String s1, String s2 , int m, int n, int DP[][]){
// base case
if(m == 0) return n;
if(n == 0) return m;
if(DP[m-1][n-1] == -1){
if(s1.charAt(m-1) == s2.charAt(n-1)){
DP[m-1][n-1] =  helper(s1, s2 , m-1 , n-1,DP);
}
else{
DP[m-1][n-1]  = 1 + Math.min(
Math.min( helper(s1, s2, m, n-1, DP),
helper(s1, s2, m-1, n, DP)),
helper(s1, s2, m-1 ,n -1, DP)
);
}
}
return DP[m-1][n-1];
}
public int minDistance(String word1, String word2) {
int DP[][] = new int[word1.length()][word2.length()];
// fill it with -1;
for(int i = 0 ; i < DP.length; ++i){
for (int j = 0 ; j < DP[0].length; ++j){
DP[i][j] = -1;
}
}
return helper(word1 , word2 ,word1.length(), word2.length(), DP);
}
}