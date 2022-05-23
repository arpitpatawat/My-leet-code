class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count = 0 ; 
        int res = 0 ;
        for(int i = 0 ; i < nums.length; ++i){
            if(nums[i] == 0){
                res = Math.max(res, count);
                count = 0;
            }
            else count ++;
        }
        return Math.max(count , res);
    }
}