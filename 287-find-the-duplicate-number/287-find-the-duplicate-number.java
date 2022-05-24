class Solution {
    public int findDuplicate(int[] a) {
        Arrays.sort(a);
        for(int i = 1 ; i < a.length ; ++i){
            if(a[i] == a[i-1]) return a[i];
        }
        return 0;
    }
}