class Solution {
    public int trap(int[] height) {
        int n = height.length;
        int maxLeft = -1;
        int maxRight = -1;
        int left = 0;
        int right = n-1;
        int sum = 0;
        while(left < right){
            if(height[left] < height[right]){
                if(maxLeft <= height[left]){
                    maxLeft = height[left];
                }
                else{
                    sum += maxLeft - height[left];
                }
                ++left;
            }
            else{
                if(maxRight <= height[right]){
                    maxRight = height[right];
                }
                else{
                    sum += maxRight - height[right];
                }
                --right;
            }
            
        }
        return sum;
    }
}