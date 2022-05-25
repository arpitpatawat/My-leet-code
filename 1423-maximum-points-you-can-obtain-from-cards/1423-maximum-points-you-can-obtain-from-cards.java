class Solution {
    public int maxScore(int[] a, int k) {
      int t = a.length - k;
        int arrsum = 0;
    for(int i = 0 ; i < t ; ++i){
        arrsum += a[i];
    }
        int currsum = arrsum;
        int minsum = currsum;
    for(int i = t; i <= a.length -1; ++i){
        currsum += a[i] - a[i-t];
        minsum = Math.min(minsum,currsum);
        arrsum += a[i];
    }
        return arrsum - minsum;
    }
}