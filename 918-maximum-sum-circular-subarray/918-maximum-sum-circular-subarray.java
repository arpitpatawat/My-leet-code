class Solution {
    public int kadane(int nums[]){
        int sum = nums[0];
        int curr = nums[0];
        for(int i = 1 ; i < nums.length ; ++i){
            curr = Math.max(curr + nums[i] , nums[i]);
            sum = Math.max(curr , sum);
        }
        return sum;
    }
    public int maxSubarraySumCircular(int[] nums) {
        
        int linear = kadane(nums);
        int total = 0;
        for(int i = 0 ; i < nums.length ; ++i){
            total += nums[i];
            nums[i] = -nums[i];
        }
        int negativeLinear = kadane(nums);
        int circular = total + negativeLinear;
        if(circular == 0) return linear;
        return (linear > circular) ? linear : circular;
    }
}