class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        Arrays.sort(intervals, (a,b) -> a[1] - b[1]);
        // for(int i[] : intervals){
        //     System.out.println(Arrays.toString(i));
        // }
        int ans = 0;
        int min = intervals[0][1];
        int n = intervals.length;
        for(int i = 1; i < n; ++i){
            if(intervals[i][0] < min){
                ++ans;
            }
            else{
                min = intervals[i][1];
            }
        }
        return ans;
    }
}