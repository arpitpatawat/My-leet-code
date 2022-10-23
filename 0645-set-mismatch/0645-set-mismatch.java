class Solution {
    public int[] findErrorNums(int[] nums) {
        int temp[] = new int[nums.length];          // temp -> [-1, -1, ,-1 ]
        int rep = 0;
        int loss = 0;
        for(int i = 0 ; i < nums.length ; ++i){
            if(temp[nums[i] - 1] == -1){ // 0,1,1,3
                 rep = nums[i];
                continue;
            }
            
            temp[nums[i] - 1] = -1;
            
        }
        
        for(int i = 0 ; i < temp.length; ++i){
            if(temp[i] != -1){
                loss = i + 1;
                break;
            }
        }
        
        return new int[]{rep,loss};
        
    }
}