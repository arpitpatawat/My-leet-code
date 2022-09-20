class Solution {
private int lcs(int n1[], int n2[], int i, int j, int ans[], int dp[][]){
if (i >= n1.length || j >= n2.length) return 0;
if(dp[i][j]!=-1) return dp[i][j];
int cur = 0;
if (n1[i] == n2[j]) {
cur = lcs(n1, n2, i + 1, j + 1, ans, dp)+1;
}
lcs(n1, n2, i, j + 1, ans, dp);
lcs(n1, n2, i + 1, j, ans, dp);
ans[0] = Math.max(ans[0], cur);
return dp[i][j] = cur;
}
public int findLength(int[] nums1, int[] nums2) {
int n = nums1.length, m = nums2.length;
int dp[][]= new int[n+1][m+1];
for (int[] row : dp){
Arrays.fill(row, -1);
}
int ans[] = new int[1];
lcs(nums1, nums2, 0, 0, ans, dp);
return ans[0];
}
}