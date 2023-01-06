class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a,b) -> a[0] - b[0]);
        int min = intervals[0][1];
        int start = intervals[0][0];
        List<int[]> temp = new ArrayList<>();
        for(int i = 1; i < intervals.length; ++i){
            if(intervals[i][0] <= min){
                min = Math.max(min, intervals[i][1]);
            }
            else{
                temp.add(new int[]{start,min});
                min = intervals[i][1];
                start = intervals[i][0];
            }
        }
        temp.add(new int[]{start,min});
        int ans[][] = new int[temp.size()][2];
        int index = 0;
        for(int i[] : temp){
            ans[index++] = i;
        }
        return ans;
    }
}