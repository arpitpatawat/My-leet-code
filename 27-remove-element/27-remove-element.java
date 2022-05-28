class Solution {
    public int removeElement(int[] a, int val) {
       int res = 0;
        for(int i = 0 ; i < a.length ; ++i){
            if(a[i] != val){
                // int temp = a[res];
                a[res] = a[i];
                // a[i] = temp;
                ++res;
            }
            
        }
            return res ;
    }
}