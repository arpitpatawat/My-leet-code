class Solution {
    public int minMoves2(int[] nums) {
        Arrays.sort(nums);
        int compare = 0;
        if(nums.length %2 == 0) compare = nums[nums.length/2];
        else compare = nums[nums.length/2];
        int sum = 0;
        for(int i = 0 ; i < nums.length ; ++i ){
            sum += Math.abs(nums[i] - compare);
        }
        return sum;
    }
}