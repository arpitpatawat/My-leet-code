class Solution {
    public int rob(int[] nums) {
        if(nums.length == 1){
            return nums[0];
        }
        int x1 = nums[0];
        int x2 = nums[1];
        for(int i = 2; i < nums.length ; ++i){
            // if include 
            int temp = x2;
            x2 = x1 + nums[i];
            x1 = Math.max(x1, temp);
        }
        
        return Math.max(x1, x2);
        
    }
}