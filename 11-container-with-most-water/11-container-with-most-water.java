class Solution {
    public int maxArea(int[] a) {
      int low = 0, high = a.length-1, area = 0; 
        while(low < high){
           int temparea = Math.min(a[low],a[high]) * (high-low);
            area= Math.max(temparea,area);
            if(a[low] > a[high]){high--;}
            else low++;
        }
        return area;
    }
}