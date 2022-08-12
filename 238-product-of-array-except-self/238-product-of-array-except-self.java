class Solution {
    public int[] productExceptSelf(int[] nums) {
        // zero count 
        int res[] = new int[nums.length];
        
        int zero_count = 0;
        int mul = 1;
        for(int i = 0 ; i < nums.length ; ++i){
            if(nums[i] == 0){
              if(zero_count == 0){
                  zero_count = 1;
              }
              else{
                 for(int j = 0 ; j < nums.length ; ++j){
                     res[j] = 0;
                 }
                  return res;
              }
            }
            else{
                mul = mul * nums[i];
            }   
        }
        for(int i = 0 ; i < nums.length ; ++i){
            if(nums[i] == 0){
                res[i] = mul;
            }
            else if(zero_count == 1){
                res[i] = 0; 
            }
            else{
                res[i] = mul / nums[i];
            }
        }
        
        
        return res;
    }
}