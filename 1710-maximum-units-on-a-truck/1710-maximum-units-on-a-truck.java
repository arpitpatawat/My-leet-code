class Solution {
    public int maximumUnits(int[][] nums, int truckSize) {
        Arrays.sort(nums , (a,b) -> b[1] - a[1]);
        int count = 0;    
        int i = 0;
        while(truckSize > 0 && i< nums.length){
            int minimum = Math.min(truckSize, nums[i][0]);
            count += minimum * nums[i][1];
            truckSize -= minimum;
            ++i;    
        }
        return count ;
    }
}