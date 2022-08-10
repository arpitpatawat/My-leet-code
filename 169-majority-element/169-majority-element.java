class Solution {
    public int majorityElement(int[] nums) {
        int max = 1;
        int maxfinal = nums[0];
        for(int i = 1 ; i < nums.length ; ++i){
            if(nums[i] == maxfinal){
                max++;
            }
            else{
                max--;
            }
            if(max == 0){
                max = 1;
                maxfinal = nums[i];
            }
        }
        return maxfinal;
    }
}