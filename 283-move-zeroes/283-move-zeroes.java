class Solution {
    public void moveZeroes(int[] a) {
        int res = 0 , temp = 0;
        for(int i = 0 ; i < a.length ; ++i){
            if(a[i] != 0){
                temp = a[res];
                a[res] = a[i];
                a[i] = temp;
                res ++;
            }
        }
    }
}