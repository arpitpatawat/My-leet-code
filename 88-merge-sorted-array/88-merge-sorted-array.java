class Solution {
    public void merge(int[] a, int m, int[] b, int n) {
     int k = m - 1;
     int j = n - 1;
     int i = 0;
     for( i = m+n-1 ; i >= 0; --i){
         
         if(k < 0 || j < 0) break;
         if(a[k] > b[j]){
             a[i] = a[k--];
            // --k;
         } 
         else {
             a[i] = b[j--];
           //  --j;
         }
     }
         while (j >= 0) { 
        a[i--] = b[j--]; }
        
    }
}