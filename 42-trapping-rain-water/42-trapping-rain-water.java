// class Solution {
//     public int trap(int[] height) {
//         int n = height.length;
//         int x[] = new int[n];
//         int y[] = new int[n];
//         int maxx = height[0], maxy = height[n-1];
//         x[0] = maxx;
//         y[n-1] = maxy;
//         int j = 0,min=0,sum=0;
//         for(int i = 1 ; i < n ; i++){
//             j = n-1-i;
//             maxx = Math.max(maxx, height[i]);
//             maxy = Math.max(maxy,height[j]);
//             x[i] = maxx;
//             y[j] = maxy;      
//         }
//         for(int i = 0 ; i < n ; i++){
//             min = Math.min(x[i], y[i]);
//             sum += min - height[i];
//         }
//         return sum;
//     }
// }
















class Solution {
    public int trap(int[] height) {
        if (height == null || height.length == 0) {
            return 0;
        }
        int left = 0; int right = height.length - 1; 
        int maxLeft = 0; int maxRight = 0;
        
        int totalWater = 0;
        while (left < right) {
            if (height[left] < height[right]) {
                if (height[left] >= maxLeft) { 
                    maxLeft = height[left]; 
                } 
                else { 
                    totalWater += maxLeft - height[left]; 
                }
                left++;
                } 
            else {
                if (height[right] >= maxRight) { 
                    
                    maxRight = height[right]; 
                } 
                else {
                    totalWater += maxRight - height[right]; 
                }
                right--;
                }
                 }
        return totalWater;
    }
}