class Solution {
    public boolean canJump(int[] a) {
        int res = a.length - 1;
        for(int i = a.length - 2; i >= 0 ; --i){
            int temp = a[i];
            if(temp - (res - i) >= 0){
                res = i;
            }
        }
        
        return (res==0) ? true : false;
    }
}