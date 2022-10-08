class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int ans = nums[0] + nums[1] + nums[2];
        int temp = Math.abs(target - nums[0] - nums[1] - nums[2]);
        for(int i = 0 ; i < nums.length ; ++i){
            int sum = target  - nums[i];
            int low = i+1;
            int high = nums.length - 1;
            while(low < high){
               if(Math.abs(sum - nums[low] - nums[high]) < temp){
                   ans = nums[i] + nums[low] + nums[high];
                   temp = Math.abs(sum - nums[low] - nums[high]);
               }
            if(nums[low] + nums[high] > sum){
                high--;
            }
            else{
                low ++;
            }
            
           
            
            }
            
        }
        
        return ans;
    }
}