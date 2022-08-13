class Solution {
    public int maxArea(int[] height) {
        int low = 0;
        int high = height.length - 1;
        int store = 0;
        int count = 0;
        
        while(low < high){
            count = Math.min(height[low] , height[high]) * (high - low);
            store = Math.max(store , count);
            
            if(height[low] > height[high]){
                high--;    
            }
            else{
                low++;
            }
        }
        
        
        return store;
    }
}