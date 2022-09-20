class Solution {
public int lcs(int[] nums1, int[] nums2 , int m , int n, Integer dp[][]){
if(m < 0 || n < 0){
return 0;
}
if(dp[m][n] == null){
int ans = 0;
if(nums1[m] == nums2[n]){
ans = 1 + lcs(nums1 , nums2, m-1, n-1, dp);
}
else{
ans=  Math.max(lcs(nums1, nums2 , m-1 , n, dp) , lcs(nums1, nums2 , m, n-1, dp));
}
dp[m][n] = ans;
}
return dp[m][n];
}
public int findLength(int[] nums1, int[] nums2) {
int m = nums1.length - 1;
int n = nums2.length - 1;
Integer dp[][] = new Integer[m+1][n+1];
return lcs(nums1 , nums2 , m, n, dp);
}
}