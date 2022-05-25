class Solution {
    public int maxScore(int[] a, int k) {
    //   int t = a.length - k;
    //     int arrsum = 0;
    // for(int i = 0 ; i < t ; ++i){
    //     arrsum += a[i];
    // }
    //     int currsum = arrsum;
    //     int minsum = currsum;
    // for(int i = t; i <= a.length -1; ++i){
    //     currsum += a[i] - a[i-t];
    //     minsum = Math.min(minsum,currsum);
    //     arrsum += a[i];
    // }
    //     return arrsum - minsum;
        
        
        int n=a.length, res=0;
        
        for(int i=0;i<k;i++) res+=a[i];
        int curr_sum=res;
        int j=1;
        for(int i=k-1;i>=0;i--) {
            // cout << curr_sum << endl;
            curr_sum = curr_sum-a[i]+a[n-j];
            j++;
            res=Math.max(res, curr_sum);
        }
        return res;
    }
}