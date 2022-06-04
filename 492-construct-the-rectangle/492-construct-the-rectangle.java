class Solution {
    public int[] constructRectangle(int area) {
        int arr[] = {area,1};
        for(int i = 1 ; i<= area; ++i){
            if(area % i == 0 && i>= area/i)
                if(i - area/i < arr[0] - arr[1]){
                arr[0] = i;
                arr[1] = area/i;
                    }
        }
        return arr;
    }
}