class Solution {
    public int findMinArrowShots(int[][] points) {
        int ans = 0;
        Arrays.sort(points, (a,b) -> a[0] == b[0] ? a[1] - b[1] : a[0] - b[0]);
        int min = points[0][0];
        int max = points[0][1];
        int n = points.length;
        for(int i = 1; i < n; ++i){
            if(points[i][0] >= min && points[i][0] <= max){
                min = Math.max(min, points[i][0]);
                max = Math.min(max, points[i][1]);
            }
            else{
                ++ans;
                min = points[i][0];
                max = points[i][1];
            }
        }
        return ans+1;
    }
}