class Solution {
    public int lcs(int[] nums1, int[] nums2 , int m , int n, Integer dp[][], int glo[]){
        
        if(m < 0 || n < 0){
            return 0;
        }
        if(dp[m][n] != null){
            return dp[m][n];
        }
        int ans = 0;
        if(nums1[m] == nums2[n]){
            ans = 1 + lcs(nums1 , nums2, m-1, n-1, dp,glo);
        }
        
            lcs(nums1, nums2 , m-1 , n, dp,glo);
            lcs(nums1, nums2 , m, n-1, dp,glo);
        
        glo[0] = Math.max(glo[0] , ans);
        dp[m][n] = ans;
        return dp[m][n];
        
    }
    
    public int findLength(int[] nums1, int[] nums2) {
        int m = nums1.length - 1;
        int n = nums2.length - 1;
        int glo[] = new int[1];
        Integer dp[][] = new Integer[m+1][n+1];
        int x =  lcs(nums1 , nums2 , m, n, dp, glo);
        // for(int i = 0 ; i < nums1.length ; ++i){
        //     System.out.println(Arrays.toString(dp[i]));
        // }
        return glo[0];
    }
}