class Solution {
    public int trap(int[] height) {
        int n = height.length;
        int x[] = new int[n];
        int y[] = new int[n];
        int maxx = height[0];
        int maxy = height[n-1];
        x[0] = maxx;
        y[n-1] = maxy;
        int j = 0;
        int min,sum=0;
        for(int i = 1 ; i < n ; i++){
            j = n-1-i;
            maxx = Math.max(maxx, height[i]);
            maxy = Math.max(maxy,height[j]);
            x[i] = maxx;
            y[j] = maxy;      
        }
        for(int i = 0 ; i < n ; i++){
            min = Math.min(x[i], y[i]);
            sum += min - height[i];
        }
        return sum;
    }
}