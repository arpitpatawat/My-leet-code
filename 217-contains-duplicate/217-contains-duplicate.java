class Solution {
    public boolean containsDuplicate(int[] a) {
        Arrays.sort(a);
     int res = 0;
        for(int i = 1 ; i < a.length; i++){
            if(a[i] != a[res]){
                res ++;
            }
            else return true;
        }
        return false;
    }
}