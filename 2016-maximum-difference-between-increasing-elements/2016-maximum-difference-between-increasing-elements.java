class Solution {
    public int maximumDifference(int[] nums) {
        int ans = -1;
        int min = nums[0];
        for(int i = 1; i < nums.length ; ++i){
          if(nums[i] > min){
              ans = Math.max(nums[i] - min , ans);
              
          }  
            else{
                min = nums[i];
            }
        }
        return ans;
    }
}