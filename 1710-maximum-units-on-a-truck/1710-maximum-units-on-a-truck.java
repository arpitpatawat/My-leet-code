class Solution {
    public int maximumUnits(int[][] nums, int truckSize) {
        Arrays.sort(nums , (a,b) -> b[1] - a[1]);
        // for(int i = 0 ; i < nums.length; ++i){
        //     for(int j = 0; j < 1 ; ++j){
        //         System.out.println(nums[i][0] +","+ nums[i][1]);
        //     } 
        // }
        int count = 0;    
        for(int i = 0 ; i < nums.length ; ++i){
            if(truckSize ==0) break;
            int temp = nums[i][0];
            while(temp != 0 && truckSize != 0){
                count += nums[i][1];
                --temp;
                --truckSize;
            }
        }
        return count ;
    }
}