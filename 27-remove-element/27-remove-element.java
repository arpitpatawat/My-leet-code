class Solution {
    public int removeElement(int[] a, int val) {
       int res = 0;
        for(int i = 0 ; i < a.length ; ++i){
            if(a[i] != val){
                a[res] = a[i];
                ++res;
            }
            
        }
            return res ;
    }
}