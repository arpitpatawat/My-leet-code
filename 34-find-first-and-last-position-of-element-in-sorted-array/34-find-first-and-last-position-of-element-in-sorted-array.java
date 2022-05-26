class Solution {
    public int[] searchRange(int[] a, int target) {
        int start = -1, end = -1;
        for(int i = 0 ; i < a.length ; ++i){
            if(a[i] == target && start == -1){
                start = i;
            }
            if(a[i] == target && start != -1){
                end =i;
            }
                
        }
        return new int[]{start,end};
    }
}