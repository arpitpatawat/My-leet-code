class Solution {
    public int maximumDifference(int[] a) {
       int res = 0, diff = -1;
        for(int i =1 ; i < a.length ; i++){
            if(a[i] > a[res]){
                diff = Math.max(diff, a[i] - a[res]);
            }
            else 
                res = i;
        }
        return diff;
    }
} 

