class Solution {
    public int minMoves2(int[] nums) {
        Arrays.sort(nums);
        int compare = nums[nums.length/2];
        int sum = 0;
        for(int i = 0 ; i < nums.length/2 ; ++i ){
            sum += compare - nums[i];
        }
        for(int i = nums.length/2 ; i < nums.length; ++i ){
            sum += nums[i] - compare;
        }
        return sum;
    }
}