class Solution {
    public int maxScore(int[] a, int k) {
        int t = a.length - k;  // min sum sliding window
        int arrsum = 0; // total array sum
        for(int i = 0 ; i < t ; ++i){
            arrsum += a[i];
        }
        // in first pass , now i have array sum just before t. 
        
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