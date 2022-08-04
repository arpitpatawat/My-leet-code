class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int sum = 0;
        int res = -1;
        for(int i = 0 ; i < nums.length; ++i){
            if(nums[i] == 0){
                ++res;
                sum = Math.max(sum , i - res);
                res = i;
            }
           
            
        }
        
        sum = Math.max(sum , nums.length - res - 1);
        
            
        return sum;
    }
}